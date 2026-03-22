import java.util.LinkedList;
import java.util.Scanner;

public class StackSimulation {

    public static void main(String[] args) {

        LinkedList<Integer> stack = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Stack Simulation Menu =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Show Stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value); 
                    System.out.println(value + " pushed to stack.");
                    break;

                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty! Nothing to pop.");
                    } else {
                        int popped = stack.pop();
                        System.out.println("Popped: " + popped);
                    }
                    break;

                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty!");
                    } else {
                        System.out.println("Current Stack: " + stack);
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}


