package hr.fer.oop.pred10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFileExample {
    public static void main(String[] args) throws IOException {
        Path p = Path.of("/Users/dominik/IdeaProjects/OOP2022/Predavanja/src/hr/fer/oop/pred10/proba.txt");

//        //PrintWriter
//        PrintWriter writer = new PrintWriter(p.toFile());
//        writer.println("Od vufera izbasirana");
//        writer.println("Ja čekam te izgasirana");
//        writer.close();

//        FileWriter fw = new FileWriter(p.toFile(), true);
//        PrintWriter writer = new PrintWriter(fw);
//        writer.println("Jos weeeee!!");
//        writer.close();

        Files.writeString(p, "OOP");
    }
}
