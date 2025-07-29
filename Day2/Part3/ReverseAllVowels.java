// Given a string s, reverse only all the vowels in the string and return it.
// ‌
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
package Day2.Part3;


public class ReverseAllVowels {
    public static void main(String[] args)
    {
        String s = "";
        String t = "abcde";

        if(s.length()==0)
            System.out.println(t);
        else{
            int[] freq=new int[26];
            int index = 0;
            for(int i=0;i<s.length();i++)
            {
                index = s.charAt(i)-'a';
                freq[index]++;
                index++;
            }
            
            for(int i=0;i<t.length();i++)
            {
                int ind = t.charAt(i)-'a';
                if(freq[ind]==0)
                    System.out.print(t.charAt(i));
            }
        }
    }

    
}
