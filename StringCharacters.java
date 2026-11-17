import java.util.Scanner;

public class StringCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string (at least 3 characters): ");
        String text = sc.nextLine();

        if (text.length() >= 3) {
            System.out.println("First character = " + text.charAt(0));
            System.out.println("Last character = " + text.charAt(text.length() - 1));
            System.out.println("Character at position 3 = " + text.charAt(2));
        } else {
            System.out.println("Please enter at least 3 characters.");
        }
        sc.close();
    }
}
