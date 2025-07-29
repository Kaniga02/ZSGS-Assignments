import java.util.Scanner;

public class PaymentGateWay { 
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Transaction Id  : ");
        String tid = sc.nextLine();
        System.out.println("Enter the Payer Name : ");
        String payerName = sc.nextLine();
        System.out.println("Enter the Payee Name : ");
        String payeeName = sc.nextLine();
        System.out.println("Enter the Amount : ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the Payment Method : ");
        String paymethod = sc.nextLine();
        System.out.println("Enter the Payment Status : ");
        String payStatus = sc.nextLine();
        Transaction trans = new Transaction();
        trans.setId(tid);
        trans.setPayerName(payerName);
        trans.setPayeeName(payeeName);
        trans.setAmount(amount);
        trans.setMethod(paymethod);
        trans.setpayStatus(payStatus);

        trans.display();

        sc.close();
    }
    
}//class PaymentGAteWay

class Transaction
{
    private String tId;
    private String PayerName;
    private String PayeeName;
    private double amount;
    private String payMethod;
    private String paystatus;
    
    public void setId(String id)
    {
        tId = id;
    }
    public String getId()
    {
        return tId; 
    }
    public void setPayeeName(String payeeName)
    {
        this.PayeeName = payeeName;
    }
    public String getPayeeName()
    {
        return PayeeName;
    }
    public void setPayerName(String payerName)
    {
        this.PayerName = payerName;
    }
    public String getPayerName()
    {
        return PayerName;
    }
    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    public double getAmount()
    {
        return amount;
    }
    public void setMethod(String method)
    {
        this.payMethod = method;
    }
    public String getMethod()
    {
        return payMethod;
    }
    public void setpayStatus(String paystatus)
    {
        this.paystatus = paystatus;
    }
    public String getpayStaus()
    {
        return paystatus;

    }

    public void display()
    {
        System.out.println("Transaction Summary  : ");
        System.out.println("--------------------");
        System.out.println("Transaction ID    : " + getId());
        System.out.println("Payer Name        : " + getPayerName());
        System.out.println("Payee Name        : " + getPayeeName());
        System.out.println("Amount            : " + getAmount());
        System.out.println("Payment Method    : " + getMethod());
        System.out.println("Transaction Status: " + getpayStaus());
        System.out.println("================================");
    }
   


}
