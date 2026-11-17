import java.util.Scanner;

public class TotalBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price of one item: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double total = price * quantity;
        System.out.printf("Total bill = %.2f%n", total);
        sc.close();
    }
}
