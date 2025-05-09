package tr.edu.maltepe.oop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Çalışanları dizi yerine doğrudan List olarak oluştur
        List<Employee> employees = Arrays.asList(
                new HourlyEmployee("mustafa", 1001, 25.0, 160),
                new SalariedEmployee("Enes", 1002, 5000.0),
                new HourlyEmployee("Cenk", 1003, 20.0, 140),
                new SalariedEmployee("Ahmet", 1004, 6000.0)
        );

        // Listeyi rastgele sıraya sok
        Collections.shuffle(employees);   // JVM her başlatıldığında yeni bir karışım

        // Yazdır
        for (Employee emp : employees) {
            System.out.printf("Name: %s | ID: %d | Monthly Salary: %,.2f%n",
                    emp.getName(), emp.getEmployeeId(), emp.calculateMonthlySalary());
        }
    }
}