package lab_6;

import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        Scanner scanCalc2 = new Scanner(System.in);
        
        System.out.println("Please input the first number");
        int numb1 = scanCalc.nextInt();
        
        System.out.println("Please input the operator sign");
        String ops = scanCalc2.nextLine();
        
        System.out.println("Please input the second number");
        int numb2 = scanCalc.nextInt();
        
        String sign = ops;
        String oprCalc;
  
        
        switch (sign) {
        case "+":
            oprCalc = numb1 + " + " + numb2 + " = " + (numb1+numb2) ;
            break;
        case "-":
            oprCalc = numb1 + " - " + numb2 + " = " + (numb1-numb2);
            break;
        case "/":
            oprCalc = numb1 + " / " + numb2 + " = " + (numb1/numb2) ;
            break;
        case "*":
            oprCalc = numb1 + " x " + numb2 + " = " + (numb1*numb2) ;
            break;
        default:
            oprCalc = "Invalid Operator";
        }
        System.out.println(oprCalc);
        
    }

}