package hr.fer.oop.samostalneVjezbe.vjezba04.zad01;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path inputFile = Path.of("Samostalne vjezbe/src/hr/fer/oop/samostalneVjezbe/vjezba04/zad01/log.txt");
        LogProcessor processor = new LogProcessor(inputFile);
        processor.load();
        List<LogEntry> logs = processor.getLogs();
        LogEntry log = logs.get(0);
        System.out.printf("%s;%s;%s;%s;", log.getTime(), log.getLevel(), log.getThread(), log.getText());
    }
}
