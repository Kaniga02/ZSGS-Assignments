/*Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself. */
package Part3;

public class Pro6 {
    public static void main(String[] args)
    {
        String num1 = "129";
        String num2 = "11";
        int point1 = num1.length()-1;
        int point2 = num2.length()-1;
        int carry = 0;
        String result = "";
        while(point1>=0 || point2>=0 || carry!=0)
        {
            int t1 = (point1>=0)?num1.charAt(point1)-'0':0;
            int t2 = (point2>=0)?num2.charAt(point2)-'0':0;

            int sum = t1+t2+carry;
              carry = sum/10;
                sum = sum%10;
                
           
            result = sum + result;
            point1--;
            point2--;

        }
        System.out.println(result);
    }
    
}
