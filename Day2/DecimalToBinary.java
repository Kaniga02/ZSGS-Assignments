package Day2;
public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 5;
        String res = ""; 
        if(num == 0)
            res = "0";
        else {
            while(num>0)
            {
                int r = num%2;
                res = r+ res;
                num = num/2;
            }
            System.out.println("Binary numbers is "+res);
        }
    } 
}
