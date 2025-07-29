/*Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub) – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class.   */

package Day4;
import java.util.*;

public class MyString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        MyString mystr = new MyString();


        System.out.println("Enter the String  : ");
        String str = sc.nextLine();

        System.out.println("\n--- String Operations ---");
        System.out.println("1. Length");
        System.out.println("2. charAt(index)");
        System.out.println("3. equals(second string)");
        System.out.println("4. toUpperCase");
        System.out.println("5. toLowerCase");
        System.out.println("6. substring(start, end)");
        System.out.println("7. concat(second string)");
        System.out.println("8. contains(substring)");
        System.out.println("9. indexOf(character)");
        System.out.println("10. replace(old, new)");

        System.out.println("enter your choice : ");
        int ch = sc.nextInt();
        sc.nextLine();

        switch(ch)
        {
            case 1:
                System.out.println("1. Length");
                int len = mystr.findLength(str);
                System.out.println("String length is "+len);
                break;
            case 2:
                System.out.println("2. charAt(index)");
                System.out.println("Enter the index : ");
                int n= sc.nextInt();
                System.out.println(mystr.findChar(n,str));

                break;
            case 3:
                System.out.println("3. equals(second string)");
                System.out.println("Enter the second String  : ");
                String str2= sc.nextLine();
                boolean f = mystr.equals(str,str2);
                System.out.println(f==true?true:false);
                break;
            case 4:
                System.out.println("4. toUpperCase");
                System.out.println(mystr.upperCase(str));
                break;
            case 5:
                System.out.println("5. toLowerCase");
                System.out.println(mystr.lowerCase(str));
                break;
            case 6:
                System.out.println("6. substring(start, end)"); 
                System.out.println("Enter the start index : ");  
                int start = sc.nextInt();
                System.out.println("Enter the End index : ");
                int end = sc.nextInt();
                System.out.println(mystr.substring(str,--start,--end));
                break;
            case 7:
                System.out.println("7. concat(second string)");                
                System.out.println("Enter the second String  : ");
                String str3= sc.nextLine();
                System.out.println(mystr.concat(str,str3));
                break;
            case 8:
                System.out.println("8. contains(substring)");                
                System.out.println("Enter the second String  : ");
                String str4= sc.nextLine();
                System.out.println(mystr.contains(str,str4));
                break;
            case 9:
                System.out.println("9. indexOf(character)");                
                System.out.println("Enter the char  : ");
                char c= sc.next().charAt(0);
                System.out.println(mystr.indexOf(c,str));
                break;
            case 10:
                System.out.println("10. replace(old, new)");                
                System.out.println("Enter the delete String  : ");
                char delstr= sc.next().charAt(0);
                System.out.println("Enter the replace String  : ");
                char repstr= sc.next().charAt(0);
                System.out.println(mystr.replace(str,delstr,repstr));
                break;
            default : 
                break;     


        }
        sc.close();
    }

    public  int findLength(String s)
    {
        int length = 0;

        try{
            while(true)
            {
                s.charAt(length++);
            }//while
        }//try
        catch(StringIndexOutOfBoundsException e)
        {
            length--;
        }
        return length;
    }//length

    public char findChar(int n,String str)
    {
        int t = findLength(str);
        if(n>t)
        {
            System.out.println("Index of Found");
            return '\0';
    }
            return str.charAt(--n);
       
    }//findchar

    public boolean equals(String str1,String str2)
    {
        int t1 = findLength(str1);
        int t2 = findLength(str2);
    boolean flag = true;
        if(t1!=t2)
            System.out.println(" Two String are not equal..");
        else{
             
            for(int i = 0;i<t1;i++)
                if(str1.charAt(i)!=str2.charAt(i)){
                    flag = false;
                    break;
                }//if
        }//else
        return flag;
   }//equals

    public String upperCase(String s){
        int len = findLength(s); 
        String result = "";

        for(int i=0;i<len;i++)
        {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                result += (char)(ch-32);
            }//if
            else{
                result +=ch;
            }

        }//for
        return result;
    }//uppercase

    public String lowerCase(String s){
        int len = findLength(s); 
        String result = "";

        for(int i=0;i<len;i++)
        {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {
                result += (char)(ch+32);
            }//if
            else{
                result +=ch;
            }

        }//for
        return result;
    }//Lowercase

    public String substring(String s,int start,int end){
        int len = findLength(s);
        String result = "";
        if((start>=0 || start<=len) && (end<=len || end>=0) && start<end)
        {
            for(int i = start; i <=end; i++)
                result+=s.charAt(i);
        }//if
        else{
            System.out.println("Invalid index");
            return "false";
        }
        return result;
    }

    public String concat(String str,String str2)
    {
        String result ="";
        int len1 = findLength(str);
        int len2 = findLength(str2);
        for (int i = 0; i <len1; i++) {
        result += str.charAt(i);
    }

    for (int i = 0; i <len2; i++) {
        result += str2.charAt(i);
    }
        return result;
    }//concat

    public boolean contains(String str,String str2)
    {
        int len1 = findLength(str);
        int len2 = findLength(str2);

        boolean found = false;

        if (len2 > len1) {
            System.out.println("Substring is longer than the original string.");
            return false;
        }
        for (int i = 0; i <= len1-len2; i++) {
        boolean match = true;

        for (int j = 0; j < len2; j++) {
            if (str.charAt(i + j) != str2.charAt(j)) {
                match = false;
                break;
            }
        }

        if (match) {
            found = true;
            break;
        }
     }//for
        if(found)
            return found;
        else
            return found;
       
    }//contains

    public int indexOf(char ch,String s){
        int len = findLength(s);
        
        for(int i=0;i<len;i++)
            if(s.charAt(i)==ch)
                return i;

        return -1;
    }//indexOf

    public String replace(String str,char ch,char rstr)
    {
        int len = findLength(str);
        int index = -1;
        for(int i= 0;i<len;i++)
        {
            if(ch==str.charAt(i))
            {
                index = i;
                break;
            }
        }
        if (index == -1) {
             return str; 
            }
     else if (index == 0) {
            return rstr + str.substring(1, len); // replace first char
     }
      else if (index == len - 1) {
                return str.substring(0, len - 1) + rstr; // replace last char
            } 
            else {
                return str.substring(0, index) + str.substring(index + 1, len); // remove middle char
            }

    }

}//main