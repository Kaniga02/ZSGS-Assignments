/*Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false*/
package Part3;

public class Pro5 {
    public static void main(String[] args)
    {
        String str1 = "avc";
        String str2 = "ahbgdc";

        int i=0, j= 0;
        while(i<str1.length() && j<str2.length())
        {
            if(str1.charAt(i)==str2.charAt(j))
                i++;
            j++;
        }
        System.out.println(i==str1.length()?true:false);


    }
    
}
