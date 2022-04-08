import java.io.*;
import java.util.*;



public class ExpensesTracker {
	public static void main(String[] args) throws IOException 
	{
                
		Scanner scan = new Scanner (System.in);   
                
                FileWriter output = new FileWriter (new File("Expenses.txt"));
		
                String Yes;
                String Summary;
		
                do {    
                    do {
                        System.out.print ("Input your first name: ");
                        String name = scan.nextLine();
                        System.out.print ("What did you purchase: ");
                        String item = scan.nextLine();
                        System.out.print ("How much did you pay: ");
                        double expense = scan.nextDouble();	
                        scan.nextLine();
                        System.out.println();
                        System.out.println ("Would you like to log another purchase?");
                        Yes = scan.nextLine();
                        data data = new data (name, item, expense);
                        output.write(data.toString() + "\n");
                    } while (Yes.equalsIgnoreCase("y"));
                    output.close();
                    System.out.println ("Would you like to read a summary of your purchase?");
                    Summary = scan.nextLine ();
                    Scanner scanFromFile = new Scanner (new File ("Expenses.txt"));
                    while ( scanFromFile.hasNext() )
                    {
                        System.out.println ( scanFromFile.nextLine() );
                    }
                } while (Yes.equalsIgnoreCase ("y"));
	
	}
}