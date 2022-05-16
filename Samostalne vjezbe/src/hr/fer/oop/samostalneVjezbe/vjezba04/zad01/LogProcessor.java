package hr.fer.oop.samostalneVjezbe.vjezba04.zad01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

class LogProcessor {
    private Path file;
    private List<LogEntry> list = new LinkedList<>();
    /**
     * Creates object and set file.
     * @param file file name
     */
    public LogProcessor(Path file) {
        this.file = file;
    }

    /**
     * Load file and populate list of loaded objects (LogEntry).
     * @throws IOException if can not load file
     */
    public void load() throws IOException {
        if(!Files.exists(file)) {
            throw new  IOException();
        }
        List<String> lines = Files.readAllLines(file);
        for(String line : lines) {
            if(line.length() > 0) list.add(parseLog(line));
        }
    }

    /**
     * Returns list of log entries.
     * @return list of log entries
     */
    public List<LogEntry> getLogs() {
        return list;
    }

    /**
     * Extracts elements of line and creates LogEntry.
     * @param line one line og log file
     * @return created log entry object
     */
    public static LogEntry parseLog(String line) {
        String[] data = line.split("\\s+");
        String time = data[0] + " " + data[1];
        String level = data[2];
        // 3 , 4 , 5 , 6 preskacem
        line = line.substring(line.indexOf("]") + 1);
        String thread = line.substring(line.indexOf("[") + 1, line.indexOf("]")).trim();
        // 8 , 9 preskacem

        String text = line.substring(line.lastIndexOf(":") + 1).trim();
        return new LogEntry(time, level, thread, text);
    }
}
