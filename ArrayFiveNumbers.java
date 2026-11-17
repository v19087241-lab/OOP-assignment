import java.util.Scanner;

public class ArrayFiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("Array in original order: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.print("\nArray in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
