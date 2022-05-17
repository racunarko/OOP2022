package hr.fer.oop.samostalneVjezbe.vjezba04.zad02;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {

    private Map<String, Long> map = new HashMap<>();

    public Map<String, Long> getProjectFileSizeInfo() {
        return map;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String filename = file.getFileName().toString();
        int index = filename.lastIndexOf(".");
        if (index != -1) {
            String extension = filename.substring(index);

            Long size = map.getOrDefault(extension, (long)0);
            map.put(extension, size + attrs.size());
//            if(map.get(extension) == null) {
//                map.put(extension, attrs.size());
//            }
//            map.put(extension, map.get(extension) + attrs.size());
        }
        return FileVisitResult.CONTINUE;
    }
}
