import java.util.*;
           
public class Divide {

    public static void main(String[] args) 
    {
        //System input
        Scanner calc_d = new Scanner (System.in);
        
        //Integer input
        int frst_n, scnd_n;
        System.out.println ("Input the first number: ");
        frst_n = calc_d.nextInt();
        //
        System.out.println ("Input the second number: ");
        scnd_n = calc_d.nextInt();
        //     
        int result =  (frst_n / scnd_n);
        
        /* do we have to include the if value???? */
        
        //Output
        System.out.println (frst_n + "/" + scnd_n + "=" + result);
    }
    
}
