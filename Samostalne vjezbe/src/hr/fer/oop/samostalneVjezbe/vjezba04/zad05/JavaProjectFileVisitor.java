package hr.fer.oop.samostalneVjezbe.vjezba04.zad05;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {

    private Set<String> extensionsFilter;
    private Map<String, Set<Path>> setMap = new HashMap<>();

    public JavaProjectFileVisitor(Set<String> extensionFilter) {
        this.extensionsFilter = extensionFilter;
    }

    public Map<String, Set<Path>> getProjectPathsPerExtension() {
        Map<String, Set<Path>> out = new HashMap<>();
        for (String ext : setMap.keySet()) { // extensions
            if(!extensionsFilter.contains(ext)) {
                if (out.get(ext) == null) {
                    out.put(ext, setMap.get(ext));
                }
            }
        }
        return out;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String filename = file.getFileName().toString();
        int index = filename.lastIndexOf(".");
        if (index != -1) {
            String extension = filename.substring(index);
            if (setMap.get(extension) == null) {
                setMap.put(extension, new HashSet<>());
            }
            setMap.get(extension).add(file);
        }
        return FileVisitResult.CONTINUE;
    }
}
