package Part3;

public class SumOfTwoBinary {
    public static void main(String[] args)
    {
        String a = "11";
        String b = "1";

        int point1 = a.length()-1;
        int point2 = b.length()-1;

        String result ="";
        int carry = 0;

        while(point1>=0 || point2>=0 ||carry !=0)
        {
            
            int t1 = (point1 >= 0) ? a.charAt(point1) - '0' : 0;
            int t2 = (point2 >= 0) ? a.charAt(point2) - '0' : 0;
            int sum = t1 + t2 +carry;
            result = sum%2+result;
            carry = sum/2;
            point1--;
            point2--;    
            

        }
        System.out.println(result);

    }
    
}
