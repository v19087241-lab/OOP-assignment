import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Circumference = %.2f%n", circumference);
        sc.close();
    }
}
