package hr.fer.oop.pred10_InputOutput.Visitor;

import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter directory: ");
            String dirName = sc.nextLine();
            FileVisitor<Path> visitor = new MyFileVisitor();
            Path path = Paths.get(dirName);
            try {
                Files.walkFileTree(path, visitor);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
