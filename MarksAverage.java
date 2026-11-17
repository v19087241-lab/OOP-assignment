import java.util.Scanner;

public class MarksAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks of subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks of subject 3: ");
        double m3 = sc.nextDouble();

        double total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.printf("Total marks = %.2f%n", total);
        System.out.printf("Average marks = %.2f%n", average);
        sc.close();
    }
}
