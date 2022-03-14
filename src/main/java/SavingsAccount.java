public class SavingsAccount extends Account{
    private double minimumBalance;

    public SavingsAccount()
    {
        super(1000);
        minimumBalance = 1000;
    }
    public SavingsAccount(double balance){
        super((int) balance);
        minimumBalance=1000;
    }

    public double getMinimumBalance()
    {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance)
    {
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amountOfMoney)
    {
        if(balance - amountOfMoney >= minimumBalance){
            balance -=amountOfMoney;

        }
        System.err.println("invalid amount");

    }

    @Override
    public void deposit(double amountOfMoney) {
        if (amountOfMoney < 100) {
            System.err.println("invalid amount");

        }
        balance += amountOfMoney;
    }
}
