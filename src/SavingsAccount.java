public class SavingsAccount extends Account{
    
    private double  interestRate=0.05;
    private double afterInterest;

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getAfterInterest() {
        return this.afterInterest;
    }

    public void setAfterInterest(double afterInterest) {
        this.afterInterest = afterInterest;
    }
    public SavingsAccount(int accountNumber, double balance, String ownerName) {
            super(accountNumber, balance, ownerName);
            
        }
    public void applyInterest(){
        afterInterest = getBalance() * interestRate;
       System.out.println("Your interest is : "+afterInterest+" $");
    }
}
