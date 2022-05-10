package hr.fer.oop.pred10;

import jdk.jfr.FlightRecorder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/dominik/IdeaProjects/OOP2022/Predavanja/src/hr/fer/oop/pred10/lyrics.txt");
        Path p = Path.of("/Users/dominik/IdeaProjects/OOP2022/Predavanja/src/hr/fer/oop/pred10/lyrics.txt");

        Path p2 = f.toPath();
        File f2 = p.toFile();

        //1. Scanner
        Scanner sc = new Scanner(f);
        while (sc.hasNext())
            System.out.println(sc.nextLine());
        sc.close();

        //2. File u listu stringova
        List<String> lista = Files.readAllLines(f.toPath());
        for (String s : lista) {
            System.out.println(s);
        }

        //3. File u jedan veliki string
        String lyricsStr = Files.readString(f.toPath());
        System.out.println(lyricsStr);
    }

}
