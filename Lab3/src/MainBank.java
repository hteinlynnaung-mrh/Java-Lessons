public class MainBank {
	public static void main(String[] args) {
        // TASK 1 
        Bank a1 = new Bank();
        a1.setAccountName("AccountA");
        a1.deposit(2000);
        a1.showInfo();

        // TASK 2 
        Bank a2 = new Bank();
        a2.setAccountName("AccountB");
        a2.deposit(1000);
        a2.withdraw(300);
        System.out.println("Remaining Balance of a2: " + a2.getBalance());
        System.out.println("---------------------");

        //  TASK 3 
        a1.deposit(500);
        a2.deposit(700);

        System.out.println("Updated Information:");
        a1.showInfo();
        a2.showInfo();

        //  TASK 4 
        if (a1.getBalance() > a2.getBalance()) {
            System.out.println("a1 has more balance");
        } else if (a2.getBalance() > a1.getBalance()) {
            System.out.println("a2 has more balance");
        } else {
            System.out.println("Both accounts have equal balance");
        }

        System.out.println("---------------------");

        //  TASK 5 
        Bank a3 = new Bank();
        a3.setAccountName("AccountC");

        double total = a1.getBalance() + a2.getBalance();
        a3.deposit(total);

        System.out.println("Information of a3:");
        a3.showInfo();
    }

}
	
