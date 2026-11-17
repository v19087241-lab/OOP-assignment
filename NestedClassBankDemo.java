interface Notifier {
    void send(String message);
}

public class NestedClassBankDemo {
    private double balance; // Private field of the outer class

    public NestedClassBankDemo(double openingBalance) {
        balance = openingBalance;
    }

    // Inner class: can directly access the outer class's private balance
    class AccountManager {
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.printf("Deposited: %.2f%n", amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        public void showBalance() {
            System.out.printf("Current balance: %.2f%n", balance);
        }
    }

    // Static nested class: does not require an outer-class object
    static class ReceiptPrinter {
        public void printReceipt(String accountHolder, double amount) {
            System.out.println("--- Transaction Receipt ---");
            System.out.println("Account holder: " + accountHolder);
            System.out.printf("Transaction amount: %.2f%n", amount);
            System.out.println("----------------------------");
        }
    }

    // Accepts an object of the Notifier interface
    public void notifyCustomer(Notifier notifier, String message) {
        notifier.send(message);
    }

    public static void main(String[] args) {
        NestedClassBankDemo account = new NestedClassBankDemo(1000.00);

        // Create inner-class object using the outer-class object
        NestedClassBankDemo.AccountManager manager = account.new AccountManager();
        manager.showBalance();
        manager.deposit(500.00);
        manager.showBalance();

        System.out.println();

        // Create static nested-class object without an outer object
        NestedClassBankDemo.ReceiptPrinter printer =
                new NestedClassBankDemo.ReceiptPrinter();
        printer.printReceipt("Ravi Kumar", 500.00);

        System.out.println();

        // Create an interface implementation and pass it to the outer class
        Notifier notifier = new Notifier() {
            @Override
            public void send(String message) {
                System.out.println("Notification: " + message);
            }
        };

        account.notifyCustomer(notifier, "Your deposit was successful.");
    }
}
