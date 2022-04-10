package hr.fer.oop.samostalneVjezbe.vjezba02.zad03;

interface ReceivingSystem{
    public void customerArrived(boolean urgent);
    public void customerLeft(boolean urgent);
    public void calculateEmployeeStatus();
    public int getUrgentListSize();
    public int getNonUrgentListSize();
    public boolean isEmployeeOccupied();
    public int getNumberOfArrivedCustomers();
}
