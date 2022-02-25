import java.util.*;
           
public class Substract {

    public static void main(String[] args) 
    {
        //System input
        Scanner calc_s = new Scanner (System.in);
        
        //Integer input
        int frst_n, scnd_n, result;
        System.out.println ("Input the first number: ");
        frst_n = calc_s.nextInt();
        //
        System.out.println ("Input the second number: ");
        scnd_n = calc_s.nextInt();
        
        //Addition
        result = frst_n - scnd_n;
        
        //Output
        System.out.println (frst_n + "-" + scnd_n + "=" + result);
    }
    
}
