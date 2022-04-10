package hr.fer.oop.samostalneVjezbe.vjezba02.zad03;

class BankReceivingSystem implements ReceivingSystem {

    private boolean status;
    private int urgentCount = 0;
    private int nonUrgentCount = 0;
    private int countArrived = 0;

    public BankReceivingSystem() {
        this.status = false;
        this.countArrived = 0;
    }

    @Override
    public void customerArrived(boolean urgent) {
        if (urgent) {
            urgentCount++;
        }
        if(!urgent) {
            nonUrgentCount++;
        }
        calculateEmployeeStatus();
        countArrived++;
    }

    @Override
    public void customerLeft(boolean urgent) {
        if (urgent) {
            urgentCount--;
        }
        if (!urgent) {
            nonUrgentCount--;
        }
        calculateEmployeeStatus();
    }

    @Override
    public void calculateEmployeeStatus() {
        if (urgentCount > 0 || nonUrgentCount > 0) {
            status = true;
        }
        else {
            status = false;
        }
    }

    @Override
    public int getUrgentListSize() {
        return urgentCount;
    }

    @Override
    public int getNonUrgentListSize() {
        return nonUrgentCount;
    }

    @Override
    public boolean isEmployeeOccupied() {
        return status;
    }

    @Override
    public int getNumberOfArrivedCustomers() {
        return countArrived;
    }
}
