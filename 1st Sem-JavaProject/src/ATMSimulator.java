import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 10000.0;
        int choice;

        System.out.println("Welcome to ATM Machine");
        System.out.println("---------------------");

        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

           switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Invalid deposit amount");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds");
                    } else if (withdrawAmount > 0) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Invalid withdrawal amount");
                    }
                    break;

                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM Machine!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}