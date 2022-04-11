package hr.fer.oop.homework_05.library;

public class DigitalItem extends LibraryItem implements ItemWithCashDepozit {
    private String type;
    private final double deposit;

    public DigitalItem(int id, String name, String type, double deposit) {
        super(id, name);
        this.type = type;
        this.deposit = deposit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", type=" + type;
    }

    @Override
    public String getLoanPeriod() {
        return "30 dana";
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
