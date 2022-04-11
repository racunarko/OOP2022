package hr.fer.oop.homework_05.library;

public class Book extends LibraryItem {
    private String author;

    public Book(int id, String name, String author) {
        super(id, name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + author;
    }

    @Override
    public String getLoanPeriod() {
        return "14 dana";
    }


}
