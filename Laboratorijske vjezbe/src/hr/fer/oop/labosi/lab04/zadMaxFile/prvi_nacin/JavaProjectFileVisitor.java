package hr.fer.oop.labosi.lab04.zadMaxFile.prvi_nacin;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {

    private String extensionFilter;

    Map<String, List<Path>> files = new HashMap<>();
    Map<Path, Integer> directories = new HashMap<>();

    public JavaProjectFileVisitor(String extensionFilter) { //constructor that accept filter. Only files that match the filter are processed
        this.extensionFilter = extensionFilter;
    }

    public Path getMaxFilePath() throws IOException { //returns Path from the largest file
        long maxSize = Long.MIN_VALUE;
        Path maxFilePath = null;
        for(String ext : files.keySet()) {
            if (ext.contains(extensionFilter)) {
                for(Path file : files.get(ext)) {
                    long size = Files.size(file);
                    if (size > maxSize) {
                        maxSize = size;
                        maxFilePath = file;
                    }
                }
            }
        }
        return maxFilePath;
    }

    public long getMaxFileSize() throws IOException { //returns size of the largest file
        return Files.size(getMaxFilePath());
    }

    public Path getMaxFilesDirPath() { //returns Path of directory with most files inside that suits filter
        int maxSize = Integer.MIN_VALUE;
        Path maxDir = null;
        for (Path dir : directories.keySet()) {
            if (directories.get(dir) > maxSize) {
                maxSize = directories.get(dir);
                maxDir = dir;
            }
        }
        return maxDir;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        List<String> files = new ArrayList<>(List.of(Objects.requireNonNull(dir.toFile().list()))); // spremam sve fileove iz direktorija u listu
        files.removeIf(file -> !file.contains(extensionFilter)); // filtriram fileove po ekstenziji
        directories.put(dir, files.size()); // stavljam direktorij u mapu uz vrijednost (broj fileova s tom ekstenzijom)
        return super.postVisitDirectory(dir, exc);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        String filename = file.toString();
        int index = filename.lastIndexOf(".");
        if (index != -1) {
            String ext = filename.substring(index);
            if(!files.containsKey(ext)) {
                List<Path> list = new LinkedList<>();
                files.put(ext, list);
            }
            files.get(ext).add(file);
        }
        return FileVisitResult.CONTINUE;
    }
}
