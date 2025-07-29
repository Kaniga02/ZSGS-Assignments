/*We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters. */
package Day2.Part3;

import java.util.*;

public class Pro8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        boolean flag = validString(str);
        System.out.println(flag);
    }
    static boolean validString(String s)
    {
        if(s.equals(s.toLowerCase())) return true;

        if(s.equals(s.toUpperCase())) return true;

        String first = s.substring(0, 1);
        String rest = s.substring(1);
        if (first.equals(first.toUpperCase()) && rest.equals(rest.toLowerCase())) return true;

        return false;
    }
}