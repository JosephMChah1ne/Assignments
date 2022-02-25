import java.util.*;
           
public class Add {

    public static void main(String[] args) 
    {
        //System input
        Scanner calc_a = new Scanner (System.in);
        
        //Integer input
        int frst_n, scnd_n, result;
        System.out.println ("Input the first number: ");
        frst_n = calc_a.nextInt();
        //
        System.out.println ("Input the second number: ");
        scnd_n = calc_a.nextInt();
        
        //Addition
        result = frst_n + scnd_n;
        
        //Output
        System.out.println (frst_n + "+" + scnd_n + "=" + result);
    }
    
}
