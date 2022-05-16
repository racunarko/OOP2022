package hr.fer.oop.homework_10.task04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter directory: ");
            String dirName = sc.nextLine();
            MyFileVisitor visitor = new MyFileVisitor();
            Path path = Path.of(dirName);
            try {
                Files.walkFileTree(path, visitor);
                System.out.println("10 largest files: ");
                for (Path file : visitor.getLargestFiles()) {
                    System.out.printf("%s %d\n", file.getFileName().toString(), Files.size(file));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
