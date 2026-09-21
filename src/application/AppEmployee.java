package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class AppEmployee {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("Enter the employee's name: ");
        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.println("Enter the gross salary: ");
        System.out.println("Salary:");
        emp.grossSalary = sc.nextDouble();

        System.out.println("Enter the employee's tax on salary: ");
        System.out.println("Tax:");
        emp.tax = sc.nextDouble();

        System.out.println("Salary after tax: "+ emp.netSalary());


        System.out.println("Inform percentage's increase: ");

        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println("Salary after percentage's increase: ");
        System.out.println(emp);


        sc.close();






    }
}
