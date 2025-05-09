package tr.edu.maltepe.oop;


public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateMonthlySalary() {
        return monthlySalary;
    }
}