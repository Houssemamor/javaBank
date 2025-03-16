
public abstract class Account {
    private int accountNumber;
    private double balance=0;
    private String ownerName;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
        return accountNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @SuppressWarnings("unused")
    private void setBalance(double balance){
        balance = this.balance;        
    }

    public void deposit(double amount){
       this.balance+= amount;
       System.out.println("You have deposited : "+amount+" $");
       System.out.println("Your new Balance is : "+this.balance+" $");
    }

    public void withdraw(double amount){
        this.balance-= amount;
        System.out.println("You have withdrawn : "+amount+" $");
        System.out.println("Your new Balance is : "+this.balance+" $");
    }

    public double getBalance(){
        System.out.println("your Balance is : "+this.balance+" $");
        return this.balance;

    }


    public Account(int accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
        
    }
   
}
