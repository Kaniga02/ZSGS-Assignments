/*Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '. */
package Day2.Part3;

public class Pro7 {
    public static void main(String[] args)
    {
        String str = "Hello, my name is kaniga";
        int count = 1;

        for(int i=0;i<str.length()-1;i++)
            if(str.charAt(i)==' ')
                count++;

        System.out.println(count);

    }
    
}
