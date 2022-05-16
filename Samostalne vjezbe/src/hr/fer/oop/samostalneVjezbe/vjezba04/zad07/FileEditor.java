package hr.fer.oop.samostalneVjezbe.vjezba04.zad07;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class FileEditor {

    /**
     * Reads input file encoded in UTF-8, process content and writes it to output file.
     * @param inputFile input file
     * @param outputFile output file
     * @throws IOException
     */
    public static void processFile(Path inputFile, Path outputFile) throws IOException {
        List<String> lines = new LinkedList<>();
        Scanner sc = new Scanner(inputFile, StandardCharsets.UTF_8);
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
        FileWriter writer = new FileWriter(outputFile.toFile());
        for(String line : lines) {
            writer.write(line.replaceAll("\\r\\n", ""));
            writer.write("\n");
        }
        writer.close();
    }
}
