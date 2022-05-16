package hr.fer.oop.homework_10.task05;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Locale;
import java.util.Scanner;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String filename = file.getFileName().toString().toLowerCase(Locale.ROOT);
        if(filename.endsWith(".txt")) {
             System.out.println(file.toString());
            try (Scanner sc = new Scanner(file)) {
                String line = sc.nextLine();
                if (line != null) {
                    System.out.printf("\t%s\n", line);
                }
            }
        }
        return FileVisitResult.CONTINUE;
    }
}
