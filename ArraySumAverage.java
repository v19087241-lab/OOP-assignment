import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive array size.");
            sc.close();
            return;
        }

        double[] numbers = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        System.out.printf("Sum = %.2f%n", sum);
        System.out.printf("Average = %.2f%n", sum / n);
        sc.close();
    }
}
