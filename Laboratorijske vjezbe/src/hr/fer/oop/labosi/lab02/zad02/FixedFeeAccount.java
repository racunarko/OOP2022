package hr.fer.oop.labosi.lab02.zad02;

class FixedFeeAccount extends Account{

    FixedFeeAccount(double balance) {
        super(balance);
    }

    @Override
    public void endOfMonthCharge() {
        withdraw(10);
    }
}
