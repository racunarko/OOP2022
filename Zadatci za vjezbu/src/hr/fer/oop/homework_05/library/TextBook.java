package hr.fer.oop.homework_05.library;

public class TextBook extends Book implements ItemWithCashDepozit {
    private String subject;
    private double deposit;

    public TextBook(int id, String name, String author, String subject) {
        super(id, name, author);
        this.subject = subject;
    }

    public TextBook(int id, String name, String author, String subject, double deposit) {
        super(id, name, author);
        this.subject = subject;
        this.deposit = deposit;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", subject=" + subject;
    }

    @Override
    public String getLoanPeriod() {
        return "120 dana";
    }

    @Override
    public boolean hasCashDeposit() {
        return deposit > 0;
    }

    @Override
    public double getCashDepozitAmmount() {
        return deposit;
    }
}
