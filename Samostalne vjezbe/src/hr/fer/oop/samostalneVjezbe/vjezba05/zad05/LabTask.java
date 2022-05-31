package hr.fer.oop.samostalneVjezbe.vjezba05.zad05;

import java.util.*;

class LabTask {
    public static Collection<Zapis> readData() {
        // Dovršiti
        Collection<Zapis> col = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if(line.equals("quit")) {
                break;
            }
            String[] data = line.split("#");
            Zapis entry = new Zapis(data[0], Integer.parseInt(data[1]));
            col.removeIf(element -> element.equals(entry));
            col.add(entry);
        }
        return col;
    }
}
