//Write a program to find the first set bit of a number?
// find the first 1 position number using the bitwise operator
public class FirstBitNumber
{
    public static void main(String[] args)
    {
        int num = 6;
        int pos = findOne(num,0);
        System.out.println(pos);
    }
    public static int findOne(int n,int count)
    {   
        count++;
        if((n&1)==1) return count;
        return findOne(n>>1,count);    
    }
}