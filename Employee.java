package tr.edu.maltepe.oop;
public abstract class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract double calculateMonthlySalary();

    // Getters for private fields
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}