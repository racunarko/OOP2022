package hr.fer.oop.labosi.lab02.zad02;

class VipAccount extends Account{


    VipAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        if(amount > 10000) {
            amount += 10;
        }
        super.withdraw(amount);
    }

    @Override
    public void endOfMonthCharge() {

    }
}
