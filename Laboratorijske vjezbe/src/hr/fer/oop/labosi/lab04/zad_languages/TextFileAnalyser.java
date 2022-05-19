package hr.fer.oop.labosi.lab04.zad_languages;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class TextFileAnalyser {
    public static Language detectLanguage(Path file) throws IOException {
        boolean en;
        boolean de;
        boolean hr;
        List<String> lines = Files.readAllLines(file);


        hr = lines.stream().anyMatch(line -> line.matches(".+[šđčćžŠĐČĆŽ].+"));

        de = lines.stream().anyMatch(line -> line.matches(".+[äöüÄÖÜß].+"));

        en = lines.stream().anyMatch(line -> line.matches(".+[a-zA-Z].+"));

        if (hr && !de) {
            return Language.HR;
        } else if (de && !hr) {
            return Language.DE;
        } else if (en && !hr && !de) {
            return Language.EN;
        } else {
            return Language.UNKNOWN;
        }
    }
}