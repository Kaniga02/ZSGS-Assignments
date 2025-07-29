//Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
package Day2.Part3;

public class ExcelColumnNumber {
    public static void main(String[] args)
    {
        int columnNumber = 3;
        String result = columnTittle(columnNumber);
        System.out.println(result);
    }
    public static String columnTittle(int n)
    {
        String ans ="";
        while(n>0)
        {
            n--;
            int rem = n%26;
            char ch=(char)('A'+rem);
            ans = ch + ans;
            n = n/26;

        }
        return ans;

    }
}
