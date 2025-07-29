package Task2.stringutils;

public class StringOperations {

    public int length(String str)
    {
        int length = 0;
        
        try{
            while(true)
            {
                str.charAt(length++);
            }//while
        }//try
        catch(StringIndexOutOfBoundsException e)
        {
            length--;
        }
        return length;
    }
    public String concat(String str1,String str2)
    {
        String result = str1;

        int len = length(str2);
        for(int i = 0;i<len;i++)
        {
            result+=str2.charAt(i);
        }
        return result;
    }//concat

    public String reverseString(String str)
    {
        String result = "";
        int len = length(str);

        for(int i=len-1;i>=0;i--)
        {
            result += str.charAt(i);
        }

        return result;
    }
    
}
