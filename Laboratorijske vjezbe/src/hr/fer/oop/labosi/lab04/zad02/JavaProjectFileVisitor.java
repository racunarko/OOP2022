package hr.fer.oop.labosi.lab04.zad02;

import java.io.*;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {
    Set<String> extensionFilter = new HashSet<>();
    Map<String,Integer> map = new HashMap<>();


    public JavaProjectFileVisitor(Set<String> extensionFilter) {
        this.extensionFilter = extensionFilter;
    }

    public Map<String,Integer> getNumFilesPerExtension() {
        Map<String,Integer> out = new HashMap<>();
        for (String ext : map.keySet()) {
            if(extensionFilter.contains(ext)) {
                out.put(ext, map.get(ext));
            }
        }
        return out;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String filename = file.getFileName().toString();
        int index = filename.lastIndexOf(".");
        if (index != -1) {
            String ext = filename.substring(index);
            int count = map.getOrDefault(ext, 0);
            map.put(ext, count + 1);
        }
        return FileVisitResult.CONTINUE;
    }
}
