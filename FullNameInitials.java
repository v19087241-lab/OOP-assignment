import java.util.Scanner;

public class FullNameInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine().trim();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine().trim();

        if (firstName.isEmpty() || lastName.isEmpty()) {
            System.out.println("First name and last name cannot be empty.");
        } else {
            String fullName = firstName + " " + lastName;
            String initials = Character.toUpperCase(firstName.charAt(0)) + "."
                    + Character.toUpperCase(lastName.charAt(0)) + ".";

            System.out.println("Full name = " + fullName);
            System.out.println("Initials = " + initials);
        }
        sc.close();
    }
}
