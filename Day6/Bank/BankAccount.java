package Bank;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("INDIAN OVERSEAS BANK");
        System.out.println("====================");
        System.out.println("\n Account Creation : ");
        System.out.println("---------------------");

        System.out.println("Enter the Holder Name : ");   String name = sc.nextLine();
        System.out.println("Phone Number : "); long phno = sc.nextLong();
        System.out.println("Please deposit a openeing amount should be > 500...");
        System.out.println("Enter the Openeing Amount : "); double amount = sc.nextDouble();

        Account acc = new Account(name,phno,amount);

        acc.accCreate();
        int k;

        do{
            System.out.println("1. Deposit       : ");
            System.out.println("2. Widthdrawal   : ");
            System.out.println("3. Check Balance : ");
            System.out.println("4. Print Details : ");
            System.out.println("5. Exit - 0 : "); 

            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("\n-------- Deposit ----------- ");
                    System.out.println("Enter your Amount : ");
                    int damt = sc.nextInt();
                    acc.deposit(damt);
                   
                    break;
                case 2:
                    System.out.println("\n----------- Widthdrawal ---------");
                    System.out.println("Enter your Amount ");
                    int wamt = sc.nextInt();
                    acc.widthdrawal(wamt);
                    break;

                case 3:
                    System.out.println("\n----------. Check Balance ------------ ");
                    acc.checkBalance();
                    break;
                
                case 4:
                    System.out.println("\n------Print the Details -------");                    
                    acc.printDetails();
                    break;
                default:
                    break;
            }
            System.out.println("\nDo  you Want To Continue? ");
            k = sc.nextInt();

        }while(k!=0);
        
        

        sc.close();

    }
    
}//class BankAccount

class Account {
    private String name;
    private long accno = 123456789000877l;
    private long phno;
    private double amount;

    Account(String name,long phno,double amount)
    {
        this.name = name;
        this.phno = phno;
        this.amount = amount;
    }

    public void accCreate()
    {
        System.out.println("\n--------Successfully Creating a Account "+name+"------------");
    }

    public void deposit(double amt)
    {
        amount += amt;
        System.out.println("-------------Amount Added Successfully...... :) ---------------------");

    }
    public void widthdrawal(double amt)
    {
        if(amount<=0 && amt>0)
        {
            System.out.println("============Insufficient Balance.. :( ==============");
        }        
        else{
            amount -=amt;
            System.out.println("\n----------------Amount Received Successfully...... -------------");
        }//else
    }

    public void checkBalance()
    {
        System.out.println("Account number : "+accno);
        System.out.println("Balanace  : "+amount);
    }

    public void printDetails()
    {
        System.out.println("Account number : "+accno);
        System.out.println("Account Name   : "+name);
        System.out.println("Balance : "+amount);
    }


}
