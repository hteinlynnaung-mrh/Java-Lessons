import java.util.Scanner;

public class javaatmmachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 10000;

        System.out.println("Welcome to ATM Machine");
        System.out.println("---------------------");

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your selection: ");
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.print("Enter amount to deposit: ");
                int depositAmount = scanner.nextInt();
                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.println("Deposit successful!");
                } else {
                    System.out.println("Invalid deposit amount");
                }

            } else if (selection == 2) {
                System.out.print("Enter amount to withdraw: ");
                int withdrawAmount = scanner.nextInt();
                if (withdrawAmount > balance) {
                    System.out.println("Insufficient funds");
                } else if (withdrawAmount > 0) {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal successful!");
                } else {
                    System.out.println("Invalid withdrawal amount");
                }

            } else if (selection == 3) {
                System.out.println("Your current balance is: " + balance);

            } else if (selection == 4) {
                System.out.println("Thank you for using ATM Machine!");
                break; // Exit loop instead of using continueProgram flag

            } else {
                System.out.println("Invalid selection. Please try again.");
            }

            System.out.println(); // Adds a blank line for readability
        }

        scanner.close();
    }
}
