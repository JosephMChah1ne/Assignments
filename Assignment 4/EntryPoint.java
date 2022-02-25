import java.util.*;

public class EntryPoint
{
    public static void main(String[] args) 
    {
        Random rnd_n = new Random ();
        int rnd = rnd_n.nextInt (10);
        System.out.println ("Your Have " + rnd + " Attempt(s).");
        int rnd_minus = rnd;
        // for loop  
        for (int i = 1; i <= rnd; ++i) 
        {
            //Inputs
            String frstName, lstName;
            int age;
            double salary;
            Scanner input = new Scanner (System.in);
            //First
            System.out.println("Enter your First Name: ");
            frstName = input.nextLine();
            //Last
            System.out.println("Enter your Last Name: ");
            lstName = input.nextLine();
            //Age
            System.out.println("Enter your Age: ");
            age = input.nextInt();
            //Salary
            System.out.println("Enter your Salary: ");
            salary = input.nextDouble();
            
            Employee det1 = new Employee ("null", "null", 0, 0); 

            String instName = det1.getFrst(frstName);
            String title = det1.getLst(lstName);
            int getCodeNumb = det1.getAge(age);
            double getCredNumb = det1.getSalary(salary);

            System.out.println ("\n" + det1.toString() + "\n\n\n");
            System.out.println ( --rnd_minus + " Attempt(s) left. \n\n");
        }
    }
    
}
