import java.util.Scanner;

public class Question_07 {
    static Scanner Sc = new Scanner(System.in);
    static double bill = 0;
    static double discount = 0;
    static double tax = 0;
    static void Bill() {
        System.out.println("Enter the number of items:");
        int N = Sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Enter the amount:");
            int amount = Sc.nextInt();
            System.out.println("Enter the quantity:");
            int quantity = Sc.nextInt();
            bill = bill + (amount * quantity);
        }
    }

    static void finalbill() {
        if (bill < 1000) {
            discount = 0;
        } 
        else if (bill <= 4999) {
            discount = bill * 0.05;
        } 
        else if (bill <= 9999) {
            discount = bill * 0.10;
        } 
        else {
            discount = bill * 0.15;
        }
        double discountedAmount = bill - discount;
        tax = discountedAmount * 0.05;
        double finalAmount = discountedAmount + tax;
        System.out.printf("Subtotal: %.2f%n",bill);
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("Tax: %.2f%n",tax);
        System.out.printf("Final Amount: %.2f%n",finalAmount);
    }
    public static void main(String[] args) {
        Bill();
        finalbill();
        Sc.close();
    }
}
