package hr.fer.oop.labosi.lab02.zad02;

class WithdrawAccount extends Account {

    private int withdrawCounter;

    public int getWithdrawCounter() {
        return withdrawCounter;
    }

    public void setWithdrawCounter(int withdrawCounter) {
        this.withdrawCounter = withdrawCounter;
    }

    WithdrawAccount(double balance) {
        super(balance);
        this.withdrawCounter = 0;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        withdrawCounter++;
    }

    @Override
    public void endOfMonthCharge() {
        if (withdrawCounter > 0) {
            withdraw(0.1 * withdrawCounter);
        }
        withdrawCounter = 0;
        //super.withdraw(amount > 10000 ? amount + 10 : amount);
    }
}
