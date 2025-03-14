import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of accounts you want to create: ");
        int totalAccounts = sc.nextInt();
        Bank bank = new Bank(totalAccounts);
        for (int i = 0; i < totalAccounts; i++) {
            System.out.println("Enter the type of account you want to create: ");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            int choice = sc.nextInt();
            System.out.println("Enter the account number: ");
            int accountNumber = sc.nextInt();
            System.out.println("Enter the owner name: ");
            String ownerName = sc.next();
            System.out.println("Enter the balance: ");
            double balance = sc.nextDouble();
            while (true) { // fix the user input validation -_-
                if (choice == 1 || choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2");
                    choice = sc.nextInt();
                }
            }
            if (choice == 1) {
                SavingsAccount savingsAccount = new SavingsAccount(accountNumber, balance, ownerName);
                bank.getAccounts()[i] = savingsAccount;
            } else {
                CurrentAccount currentAccount = new CurrentAccount(accountNumber, balance, ownerName);
                bank.getAccounts()[i] = currentAccount;
            }

            }
            mainMenu(bank);
            sc.close();
        }
        
        public static void mainMenu(Bank bank) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("What would you like to do?");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Get Balance");
                System.out.println("4. Exit");
                int choice = sc.nextInt();
                int accountNumber;
                double amount;
                switch (choice) {
                case 1:
                    System.out.println("Enter the account number: ");
                    accountNumber = sc.nextInt();
                    System.out.println("Enter the amount to deposit: ");
                    amount = sc.nextDouble();
                    bank.deposit(accountNumber, amount);
                    break;
                case 2:
                    System.out.println("Enter the account number: ");
                    accountNumber = sc.nextInt();
                    System.out.println("Enter the amount to withdraw: ");
                    amount = sc.nextDouble();
                    bank.withdraw(accountNumber, amount);
                    break;
                case 3:
                    System.out.println("Enter the account number: ");
                    accountNumber = sc.nextInt();
                    bank.getBalance(accountNumber);
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("Secret option: show all accounts");
                    for (int i = 0; i < bank.getTotalAccounts(); i++) {
                        System.out.println();
                        System.out.println("Account number: " + bank.getAccounts()[i].getAccountNumber());
                        System.out.println("Owner name: " + bank.getAccounts()[i].getOwnerName());
                        System.out.println("Balance: " + bank.getAccounts()[i].getBalance());
                    }
                    break;
            
                default:
                    System.out.println("Invalid choice");
                    break;
                }
                }
            
            }
            
            
            
            
        }

