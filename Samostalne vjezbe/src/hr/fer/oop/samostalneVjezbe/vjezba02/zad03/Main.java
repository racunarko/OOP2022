package hr.fer.oop.samostalneVjezbe.vjezba02.zad03;

public class Main {
    public static void main(String[] args) {
        BankReceivingSystem brs = new BankReceivingSystem();

        brs.customerArrived(true);
        System.out.println(brs.isEmployeeOccupied());
        brs.customerArrived(false);
        brs.customerArrived(true);

        System.out.println(brs.getUrgentListSize());
        System.out.println(brs.getNonUrgentListSize());

        brs.customerLeft(true);
        System.out.println(brs.isEmployeeOccupied());
        System.out.println(brs.getUrgentListSize());
        System.out.println(brs.getNonUrgentListSize());

        brs.customerLeft(true);
        System.out.println(brs.isEmployeeOccupied());
        System.out.println(brs.getUrgentListSize());
        System.out.println(brs.getNonUrgentListSize());

        brs.customerLeft(false);
        System.out.println(brs.getNonUrgentListSize());
        System.out.println(brs.isEmployeeOccupied());

        System.out.println(brs.getNumberOfArrivedCustomers());
    }
}
