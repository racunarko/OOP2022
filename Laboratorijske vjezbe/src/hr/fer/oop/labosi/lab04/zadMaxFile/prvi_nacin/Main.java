package hr.fer.oop.labosi.lab04.zadMaxFile.prvi_nacin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws IOException {
        JavaProjectFileVisitor visitor = new JavaProjectFileVisitor(".txt");
        File f = new File("Laboratorijske vjezbe/src/hr/fer/oop/labosi/lab04/zadMaxFile/folder1");
        Files.walkFileTree(f.toPath(), visitor);
        System.out.println(visitor.getMaxFilePath());//folder1/folder2/folder3/c.txt
        System.out.println(visitor.getMaxFileSize()); //29
        System.out.println(visitor.getMaxFilesDirPath());//folder1
    }
}
