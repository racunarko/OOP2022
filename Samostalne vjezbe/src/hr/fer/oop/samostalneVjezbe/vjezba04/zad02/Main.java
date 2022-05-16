package hr.fer.oop.samostalneVjezbe.vjezba04.zad02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        JavaProjectFileVisitor visitor = new JavaProjectFileVisitor();
        File f = new File("Samostalne vjezbe/src/hr/fer/oop/samostalneVjezbe/vjezba04/zad02/folder1");
        Files.walkFileTree(f.toPath(), visitor);
        Map<String, Long> map = visitor.getProjectFileSizeInfo();
        for(String key : map.keySet())
            System.out.println("Key: " + key + " - " + map.get(key));
    }
}
