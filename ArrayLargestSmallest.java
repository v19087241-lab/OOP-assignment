import java.util.Scanner;

public class ArrayLargestSmallest {
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

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
        }

        double largest = numbers[0];
        double smallest = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Largest number = " + largest);
        System.out.println("Smallest number = " + smallest);
        sc.close();
    }
}
