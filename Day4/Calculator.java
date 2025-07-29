package Day4;

import java.util.*;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First integer value : ");
        int a = sc.nextInt();
        System.out.println("Enter the second Integer value : ");
        int b = sc.nextInt();

        ScientificCalculator bcal = new ScientificCalculator();

        System.out.println("Arithmetic Calculator  : ");
        System.out.println("---------------------- ");
        System.out.println("Addition       : "+bcal.add(a,b));
        System.out.println("Subtraction    : "+bcal.subtract(a,b));
        System.out.println("Multiplication : "+bcal.multiply(a,b));
        System.out.println("Division       : "+bcal.divide(a,b));

        System.out.println("Advanced Calculator  : ");
        System.out.println("---------------------- ");
        System.out.println("Modulus  : "+bcal.modulus(a,b));
        System.out.println("Power    : "+bcal.power(a,b));
        System.out.println("sqrt : "+bcal.sqrt(a));

        System.out.println("Scientific  Calculator  : ");
        System.out.println("---------------------- ");
        System.out.println("sin  : "+bcal.sin(a));
        System.out.println("cos  : "+bcal.cos(a));
        //System.out.println("Division : "+bcal.sqrt(a));
        



        
        sc.close();

    }
}//class calculator

class BasicCalculator{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int subtract(int a,int b)
    {
        return a-b;
    }
    public int multiply(int a,int b)
    {
        return a*b;
    }
    public int divide(int a,int b)
    {
        if(b==0){
            System.out.println("Error..");
            return 0;
        }
        return a/b;
    }

    
}//class BAsic calculator


class AdvancedCalculator extends BasicCalculator {
    public int modulus(int a,int b)
    {
        
        if(b==0)
        {
            System.out.println("Error.. the value of b is 0");
            return 0;
        }
        return a%b;
    }//method modulud

    public int power(int base,int exponent){
        int result = base;

        if(exponent==0)
            return 1;

        if(base == 0)
            return 0;
        else{
            for(int i=2;i<=exponent;i++)
            {
                result =result * base;
            }
        }

        return result;
    }
    public double sqrt(double a)
    {
        return Math.sqrt(a);
    }
    

}//class AdvancedCalculator

class ScientificCalculator extends AdvancedCalculator{
    public double sin(double angle)
    {
        return Math.sin(Math.toRadians(angle));
    }
    public double cos(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public double log(double value) {
        if (value <= 0) {
            System.out.println("Logarithm undefined for non-positive values.");
            return Double.NaN;
        }
        return Math.log(value);
    }

    public double exp(double value) {
        return Math.exp(value);
    }

}