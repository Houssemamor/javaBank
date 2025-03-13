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
            if (choice == 1) {
                SavingsAccount savingsAccount = new SavingsAccount(accountNumber, balance, ownerName);
                bank.getAccounts()[i] = savingsAccount;
            } else {
                CurrentAccount currentAccount = new CurrentAccount(accountNumber, balance, ownerName);
                bank.getAccounts()[i] = currentAccount;
            }

            }
            mainMenu();
        }
        
        public static void mainMenu() {
            Scanner sc = new Scanner(System.in);
            Bank bank = new Bank(0); // Initialize bank object
            while (true) {
                System.out.println("What would you like to do?");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Get Balance");
                System.out.println("4. Exit");
                int choice = sc.nextInt();
                switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("Secret option: show all accounts");
                    for (int i = 0; i < bank.getTotalAccounts(); i++) {
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

