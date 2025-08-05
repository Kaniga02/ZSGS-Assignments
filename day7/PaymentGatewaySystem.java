/*Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a main class where you can accept payment using different methods. */

package day7;

import java.util.Scanner;

public class PaymentGatewaySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\t---------------- Welcome to GateWay payment ----------------------");
        System.out.println("1. Credit card ");
        System.out.println("2. Debit Card ");
        System.out.println("3. UPI ");
        System.out.println("Choice Type");
        System.out.println("Enter the choice : ");
        int ch = sc.nextInt();
        double amt = 0;
        if(ch<4) {
            System.out.println("Enter the payment amount : ");
            amt = sc.nextDouble();
        }
        PaymentMethod paymethod = null;
        switch(ch)
        {
            case 1:
                paymethod = new CreditCardPayment();
                paymethod.pay(amt);
                break;
            case 2:
                paymethod = new DebitCard();
                paymethod.pay(amt);
                break;
            case 3:
                paymethod = new UPI();
                paymethod.pay(amt);
                break;
            default:
                System.out.println("Invalid choice..");
                break;

        }
        
        sc.close();
    }
    
}

interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amt) {
        System.out.println("Amount Paid "+amt+" USing Credit Card Payment");
    }
}

class DebitCard implements PaymentMethod {
    @Override
    public void pay(double amt) {
        System.out.println("Amount Paid "+amt+" USing Credit Card Payment");
    }
}

class UPI implements PaymentMethod {
    @Override
    public void pay(double amt) {
        System.out.println("Amount Paid "+amt+" USing Credit Card Payment");
    }
}






