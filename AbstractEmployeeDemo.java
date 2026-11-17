abstract class Employee {
    protected String company; // Common field for all employees

    public Employee(String company) {
        this.company = company;
    }

    // Concrete method: shared by all child classes
    public void printCompany() {
        System.out.println("Company: " + company);
    }

    // Abstract method: every child class provides its own implementation
    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String company, double monthlySalary) {
        super(company);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String company, int hoursWorked, double hourlyRate) {
        super(company);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class ContractEmployee extends Employee {
    private double contractAmount;

    public ContractEmployee(String company, double contractAmount) {
        super(company);
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
}

public class AbstractEmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("Tech Solutions", 45000),
            new PartTimeEmployee("Tech Solutions", 80, 300),
            new ContractEmployee("Tech Solutions", 60000)
        };

        for (Employee employee : employees) {
            employee.printCompany();
            System.out.printf("Salary: %.2f%n%n", employee.calculateSalary());
        }
    }
}
