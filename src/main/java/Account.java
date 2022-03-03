public class Account {
    private double balance;
    private int accountNumber;

    public Account(int a){
        balance = 0.0;
        accountNumber = a;
    }
    public void deposit(double sum){
        if(sum>0){
            balance += sum;
        }else{
            System.err.println("Account.deposit(...):" + "cannot deposit negative amount.");
        }
    }
    public void withdraw(double sum){
        if(sum>0){
            balance -= sum;
        }else{
            System.err.println("Account.withdraw(...):" + "cannot withdraw negative amount.");
        }

    }
    public double getBalance()
    {
        return balance;
    }

    public double getAccountNumber()
    {
        return accountNumber;
    }

    public String toString()
    {
        return "Acc " + accountNumber + ": " + "balance = " + balance;
    }

    public final void print() {
        System.out.println(toString());
    }

}
