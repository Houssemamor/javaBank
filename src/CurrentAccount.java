public class CurrentAccount extends Account{

    public CurrentAccount(int accountNumber, double balance, String ownerName) {
        super(accountNumber, balance, ownerName);
    }
    private double overdraftLimit;

    public void setOverdraftLimit(double limit){
        this.overdraftLimit = limit;
        System.out.println("Your overdraft limit is : "+this.overdraftLimit+" $");
    }

}
