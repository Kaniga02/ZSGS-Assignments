//Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
//{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}
package Part2;

public class BinarySearch {
    public static void main(String[] args)
    {
        int[] nums={1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
        binsearch(nums,2008);
    }
    
    public static void binsearch(int[] arr,int x)
    { 
        int left = 0;
        int right=arr.length-1;
        boolean flag =false;

        while(left<=right)
        {
            int mid = left+(right-left)/2;

            if(arr[mid]==x)
            {
               flag =true;
                break;
            }
            else if(arr[mid]>x)
                    right = mid-1;
                else
                 left = mid+1;

        }
        if(flag)
          System.out.println("Record Exists");
        else
          System.out.println("Record not exists");
    }
}
