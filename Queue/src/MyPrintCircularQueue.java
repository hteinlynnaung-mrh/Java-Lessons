import java.util.*;

public class MyPrintCircularQueue {

    static int maxarray = 10;
    static int[] data = new int[maxarray];

    // Move Front and ear here
    static int front = -1;
    static int rear = -1;

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Queue Simulation Menu =============");
            display();
            System.out.println("1. EnQueue");
            System.out.println("2. DeQueue");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = Sc.nextInt();

            switch (choice) {

                case 1:
                    // ENQUEUE
                    if ((rear + 1) % maxarray == front) {
                        System.out.println("Queue is FULL!");
                    } else {
                        System.out.print("Enter number to Enqueue: ");
                        int value = Sc.nextInt();

                        if (front == -1) {
                            // queue empty
                            front = 0;
                            rear = 0;
                        } else {
                            rear = (rear + 1) % maxarray;
                        }

                        data[rear] = value;
                        System.out.println("Enqueue Successfully!");
                    }
                    break;

                case 2:
                    // DEQUEUE
                    if (front == -1) {
                        System.out.println("Queue is EMPTY!");
                    } else {
                        System.out.println("Dequeued: " + data[front]);
                        data[front] = 0;

                        if (front == rear) {
                            // now queue becomes empty
                            front = -1;
                            rear = -1;
                        } else {
                            front = (front + 1) % maxarray;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting..");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }

            System.out.println();
            System.out.println();

        } while (choice != 3);

    }

    public static void display() {
        System.out.println("DATA Set is ");

        for (int i = 0; i < maxarray; i++) {
            if (data[i] != 0) {
                System.out.print(data[i] + " ");
            }
        }
        System.out.println("");
    }

}
