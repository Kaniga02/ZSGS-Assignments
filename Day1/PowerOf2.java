//Write a program to check if a number is a power of 2?
public class PowerOf2 {
    public static void main(String[] args)
    {
        int n = 17;
        boolean ans = divide(n);
        System.out.println(ans);
    }
    public static boolean divide(int num)
    {
        if(num==1) return true;

        if(num%2!=0)
            return false;
        else 
            return divide(num/2);

    }
}
