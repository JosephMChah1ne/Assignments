import java.text.*;

public class Employee 
{
    private String First;
    private String Last;
    private int Age;
    private double Salary;
    
    
    public Employee(String frstName, String lstName, int ageIn, double salIn)
    {
       First = frstName;
       Last = lstName;
       Age = ageIn;
       Salary = salIn;
    }
    
    public String getFrst (String frstName)
    {
       First = frstName;
       return First;
    }
    
    public String getLst (String lstName)
    {
       Last = lstName;
       return Last;
    }
    
    public int getAge (int ageIn)
    {
       Age = ageIn;
       return Age;
    }
    
    public double getSalary (double salIn)
    {
       Salary = salIn;
       return Salary;
    }
    
    
     public String toString()
    {
        return "Full Name: " + First + " " + Last + "\tAge: " + Age + "\t\tSalary: " + "$" + Salary;
    }
    
}
