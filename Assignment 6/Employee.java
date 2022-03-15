package lab_6;

import java.text.*;
import java.util.Scanner;

public class Employee {
    // Initializing variables
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    DecimalFormat dcm = new DecimalFormat ("####.00");

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);
        
        System.out.println ("Please input the employee’s first name:");
        firstName = scan.nextLine();
        System.out.println ("Please input the employee’s Last name:");
        lastName = scan.nextLine();
        System.out.println ("Please input the employee’s Age:");
        age = scan.nextInt();
        System.out.println ("Please input the employee’s Salary:");
        salary = scan.nextDouble();
        

    }

    public String toString() {
       String s = "Employee information: " + firstName + " " + lastName + ", " + age + ", $" + dcm.format(salary) ;
       return s;
    }
}