/*Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters. */
package Day2.Part3;

import java.util.*;

public class Pro3 {
    public static void main(String[] args)
    {
        String s = "leetcode";
        char[] ch = new char[s.length()];

        for(int i=0;i<s.length();i++)
        {
            ch[i]=s.charAt(i);
        }

        int right = s.length()-1;
        int left = 0;
        
        while (left < right) {
            while (left < right && !isVowel(ch[left])) {
                left++;
            }
            while (left < right && !isVowel(ch[right])) {
                right--;
            }

            char temp=ch[right];
            ch[right]=ch[left];
            ch[left]=temp;

            left++;
            right--;
        }
        String str = new String(ch);
        System.out.println(str);
        



    }
    public static boolean isVowel(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            return true;
        return false;
    }
    
}
