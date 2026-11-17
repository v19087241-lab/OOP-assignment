import java.util.Scanner;

public class DaysConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of days: ");
        int totalDays = sc.nextInt();

        if (totalDays < 0) {
            System.out.println("Number of days cannot be negative.");
        } else {
            int years = totalDays / 365;
            int remainingAfterYears = totalDays % 365;
            int weeks = remainingAfterYears / 7;
            int days = remainingAfterYears % 7;

            System.out.println("Years = " + years);
            System.out.println("Weeks = " + weeks);
            System.out.println("Remaining days = " + days);
        }
        sc.close();
    }
}
