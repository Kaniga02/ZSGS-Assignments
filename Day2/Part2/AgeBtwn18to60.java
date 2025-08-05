package Part2;

public class AgeBtwn18to60 {
    public static void main(String[] args)
    {
        int[] nums={76,45,34,89,16,67,55,87,45,5};
        printage(nums);
    }
    public static void printage(int[] nums)
    {
        int age18 = 0;
        int below60 =0;
        int above60 =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<18)
                age18++;
            else if(nums[i]>=18 && nums[i]<=60)
                below60++;
            else 
                above60++;
                
        }
        System.out.println("Below 18 :"+age18);
        System.out.println("above 18 & Below 60 :"+below60);
        System.out.println("above 60 :"+above60);
    }
}
    

