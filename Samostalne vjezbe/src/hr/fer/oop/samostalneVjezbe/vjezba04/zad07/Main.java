package hr.fer.oop.samostalneVjezbe.vjezba04.zad07;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path inputFile = Path.of("Samostalne vjezbe/src/hr/fer/oop/samostalneVjezbe/vjezba04/zad07/exampleWindows.txt");
        Path outputFile = Path.of("Samostalne vjezbe/src/hr/fer/oop/samostalneVjezbe/vjezba04/zad07/exampleLinux.txt");

        FileEditor.processFile(inputFile, outputFile);
    }
}
