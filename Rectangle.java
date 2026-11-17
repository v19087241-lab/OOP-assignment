import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        System.out.printf("Area = %.2f%n", length * breadth);
        System.out.printf("Perimeter = %.2f%n", 2 * (length + breadth));
        sc.close();
    }
}
