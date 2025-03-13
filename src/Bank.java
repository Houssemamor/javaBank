
public class Bank {
    private Account[] accounts;
    private int totalAccounts;

    public Account[] getAccounts() {
        return this.accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public int getTotalAccounts() {
        return this.totalAccounts;
    }

    public void setTotalAccounts(int totalAccounts) {
        this.totalAccounts = totalAccounts;
    }

    public Bank(int totalAccounts) {
        this.totalAccounts = totalAccounts;
        accounts = new Account[totalAccounts];
    }
    
    public void deposit(int accountNumber, double amount) {
        for (int i = 0; i < totalAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                accounts[i].deposit(amount);
            }
        }
    }
    
    public void withdraw(int accountNumber, double amount) {
        for (int i = 0; i < totalAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                accounts[i].withdraw(amount);
            }
        }
    }

    public void getBalance(int accountNumber) {
        for (int i = 0; i < totalAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                accounts[i].getBalance();
            }
        }
    }


}