package Day2.Part2;

public class PrintSingleDigit {
    public static void main(String[] args)
    {
        int[] nums = {3,57,85,49,0,45,2,3,5,6,78,54,9};
        printSingleDig(nums);
    }
    public static void printSingleDig(int[] arr)
    {
        int sumSingle = 0;
        int sumDouble = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=9&& arr[i]>=0)
                sumSingle += arr[i];
            else if(arr[i]<=99 && arr[i]>=10)
                    sumDouble += arr[i];
                else
                    continue;
        }
        System.out.println("Sum of single digit : "+sumSingle);
        System.out.println("Sum of double digit : "+sumDouble);
    }
}
