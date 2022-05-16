package hr.fer.oop.samostalneVjezbe.vjezba04.zad01;

class LogEntry {
    private String time;
    private String level;
    private String thread;
    private String text;

    public LogEntry(String time, String level, String thread, String text) {
        this.time = time;
        this.level = level;
        this.thread = thread;
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public String getLevel() {
        return level;
    }

    public String getThread() {
        return thread;
    }

    public String getText() {
        return text;
    }

}
