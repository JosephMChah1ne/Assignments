import java.util.*;
           
public class Multiply {

    public static void main(String[] args) 
    {
        //System input
        Scanner calc_m = new Scanner (System.in);
        
        //Integer input
        int frst_n, scnd_n, result;
        System.out.println ("Input the first number: ");
        frst_n = calc_m.nextInt();
        //
        System.out.println ("Input the second number: ");
        scnd_n = calc_m.nextInt();
        
        //Addition
        result = frst_n * scnd_n;
        
        //Output
        System.out.println (frst_n + "*" + scnd_n + "=" + result);
    }
    
}
