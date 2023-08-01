import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to the Vending Machine!");
        System.out.println("Enter the item that you want");
        System.out.print("1. Coca-Cola - $1.50");
        System.out.print("2. Snickers - $1.00");
        System.out.print("3. Chips - $0.75");
        System.out.print("4. Water - $1.25");
        System.out.print("5. Exit");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You selected Coca-Cola. Please insert the correct amount.");
                int payment = sc.nextInt();
                if (payment < 1.50) {
                    System.out.println("Insufficient payment. Please insert more money.");
                }
        while (payment < 1.50);

        double change = payment - 1.50;
        if (change > 0) {
            System.out.println("Thank you! Your change is $" + change);
        } else {
            System.out.println("Thank you!");
        }
                break;
            case 2:
                System.out.println("You selected Snickers. Please insert the correct amount.");
                int payment = sc.nextInt();
                if (payment < 1) {
                    System.out.println("Insufficient payment. Please insert more money.");
                }
                while (payment < 1);

                double change = payment - 1;
                if (change > 0) {
                    System.out.println("Thank you! Your change is $" + change);
                } else {
                    System.out.println("Thank you!");
                }
                break;
            case 3:
                System.out.println("You selected Chips. Please insert the correct amount.");
                int payment = sc.nextInt();
                if (payment < 0.75) {
                    System.out.println("Insufficient payment. Please insert more money.");
                }
                while (payment < 0.75);

                double change = payment - 0.75;
                if (change > 0) {
                    System.out.println("Thank you! Your change is $" + change);
                } else {
                    System.out.println("Thank you!");
                }
                break;
            case 4:
                System.out.println("You selected Water. Please insert the correct amount.");
                int payment = sc.nextInt();
                if (payment < 1.25) {
                    System.out.println("Insufficient payment. Please insert more money.");
                }
                while (payment < 1.25);

                double change = payment - 1.25;
                if (change > 0) {
                    System.out.println("Thank you! Your change is $" + change);
                } else {
                    System.out.println("Thank you!");
                }
                break;
            case 5:
                System.out.println("Thank you for using the Vending Machine. Goodbye!");
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
                break;
        }
    }
}