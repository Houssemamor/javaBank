# javaBank work in progress by Houssem
# Bank Management System

This is a simple **Bank Management System** implemented in Java, demonstrating key Object-Oriented Programming (OOP) principles such as **Abstraction, Encapsulation, Inheritance, and Polymorphism**.

## Features

- **Account Class (Abstraction & Encapsulation)**
  - Private properties: `accountNumber`, `balance`, `ownerName`
  - Public methods: `deposit()`, `withdraw()`, `getBalance()`
  - Protected method: `setBalance()` to allow controlled access for subclasses

- **SavingsAccount (Inheritance)**
  - Adds `interestRate`
  - Method `applyInterest()` to apply interest on balance

- **CurrentAccount (Inheritance)**
  - Adds `overdraftLimit`
  - Method `setOverdraftLimit()` to configure overdraft
  - Overrides `withdraw()` to allow overdraft within limits

- **Bank Class (Polymorphism)**
  - Manages multiple accounts
  - Allows deposits, withdrawals, and balance checking for any account type

## Technologies Used

- Java
- OOP Principles

## Installation & Usage

1. Clone this repository:
   ```sh
   git clone https://github.com/Houssemamor/javaBank.git
   ```
2. Open the project in your favorite Java IDE (e.g., IntelliJ, Eclipse, VS Code).
3. Compile and run `App.java`.
4. Perform transactions such as deposits, withdrawals, and interest application.

## Code Structure

```plaintext
/src
│── Account.java          # Base class (Encapsulation & Abstraction)
│── SavingsAccount.java   # Subclass with interest rate (Inheritance)
│── CurrentAccount.java   # Subclass with overdraft limit (Inheritance & Polymorphism)
│── Bank.java             # Manages multiple accounts (Polymorphism)
│── App.java             # Entry point to test the system
```

## Example Usage

```java
//WIP
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

Feel free to fork the project and submit pull requests! 🎉

