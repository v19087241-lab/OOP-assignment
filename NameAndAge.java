import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.printf("Hello %s, you are %d years old.%n", name, age);
        sc.close();
    }
}
