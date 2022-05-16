package hr.fer.oop.homework_10.task03;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class PrepareBinaryFile {
    public static void main(String[] args) throws IOException {
        String filename = "Zadatci za vjezbu/src/hr/fer/oop/homework_10/task03/years.dat";
        try(OutputStream output = Files.newOutputStream(Path.of(filename), StandardOpenOption.CREATE)) {
            for(int i = 1; i <= 10; i++) {
                output.write(i);
            }
        }
    }
}
