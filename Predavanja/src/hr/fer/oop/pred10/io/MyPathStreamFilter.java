package hr.fer.oop.pred10.io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyPathStreamFilter implements DirectoryStream.Filter<Path> {
    @Override
    public boolean accept(Path entry) throws IOException {
        String stringPath = entry.toString();
        return stringPath.endsWith(".java")
                || stringPath.endsWith(".class")
                || Files.isDirectory(entry);
    }
}
