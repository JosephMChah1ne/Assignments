package lab_6;

import java.util.Scanner;

public class EntryPoint 
    {
    public static void main (String[] args) 
    {
        //Scanner
        Scanner inp = new Scanner (System.in);
        Scanner letInp = new Scanner (System.in);
        //Basic week call
        BasicWeek BW = new BasicWeek();
        //Advanced Week call
        AdvancedWeek AW = new AdvancedWeek();
        //Calculator call
        Calculator calc;
        //Emoloyee cakk
        Employee emp;
        
        
        //Start
        System.out.println
        (
            "Which service would you like to use?"
            + "\n[1]: Basic week visualizer"
            + "\n[2]: Advanced week visualizer"
            + "\n[3]: Basic calculator"
            + "\n[4]: Employee repertoire"
        );
        //NUMBER input
        int numb = inp.nextInt();
        int numb2;
        //LETTER input
        String s;
        
        
        while ((numb >= 5 || numb <= 0))
        {
            System.out.println ("Please make sure you pick a number between 1 and 4");
            numb = inp.nextInt();
        }
        
        while (numb <= 4 || numb >= 1)
        {
            //Basic Week
            if ( numb == 1 ) 
            {
                System.out.println (BW.printDays());
                System.out.println ("Would you like to perform another operation? (y/n)");
                s = letInp.nextLine();
                if ( "y".equals(s) ) 
                { 
                    System.out.println ("Please make sure you pick a number between 1 and 4");
                    numb = inp.nextInt();    
                    while ((numb >= 5 || numb <= 0))
                    {
                        System.out.println ("Please make sure you pick a number between 1 and 4");
                        numb = inp.nextInt();
                    }
                }
                else 
                {
                    System.out.println ("Thank you!");
                    return;
                }
            }
        
            
            //Advanced Week
            if (  numb == 2 && numb != 1 && numb != 3 && numb != 4) 
            {
                System.out.println (AW.printDays());
                System.out.println ("Would you like to perform another operation? (y/n)");
                s = letInp.nextLine();
                if ( "y".equals(s) ) 
                { 
                    System.out.println ("Please make sure you pick a number between 1 and 4");
                    numb = inp.nextInt();
                    while ((numb >= 5 || numb <= 0))
                    {
                        System.out.println ("Please make sure you pick a number between 1 and 4");
                        numb = inp.nextInt();
                    }
                }
                else 
                {
                    System.out.println ("Thank you!");
                    return;
                }
            }
            
            //Calculator
            if (  numb == 3 && numb != 2 && numb != 1 && numb != 4)
            {
                calc = new Calculator();
                System.out.println ("Would you like to perform another operation? (y/n)");
                s = letInp.nextLine();
                if ( "y".equals(s) ) 
                { 
                    System.out.println ("Please make sure you pick a number between 1 and 4");
                    numb = inp.nextInt();
                    while ((numb >= 5 || numb <= 0))
                    {
                        System.out.println ("Please make sure you pick a number between 1 and 4");
                        numb = inp.nextInt();
                    }
                }
                else 
                {
                    System.out.println ("Thank you!");
                    return;
                }
            }
            
            //Employee
            if ( numb == 4 && numb != 2 && numb != 1 && numb != 3)
            {
                emp = new Employee();
                System.out.println (emp.toString());
                System.out.println ("Would you like to perform another operation? (y/n)");
                s = letInp.nextLine();
                if ( "y".equals(s) ) 
                { 
                    System.out.println ("Please make sure you pick a number between 1 and 4");
                    numb = inp.nextInt();
                    while ((numb >= 5 || numb <= 0))
                    {
                        System.out.println ("Please make sure you pick a number between 1 and 4");
                        numb = inp.nextInt();
                    }
                }
                else 
                {
                    System.out.println ("Thank you!");
                    return;
                }
            }
            

        
        }
    }
}
