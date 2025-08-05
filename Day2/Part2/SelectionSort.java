package Part2;

public class SelectionSort {
    public static void main(String[]args)
    {
        int[] nums={76,45,34,89,79,67,55,87,45,40,72};
        sort(nums);
    }
    public static void sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int temp = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[temp])
                    temp = j;
            }
            int swap = arr[i];
            arr[i] = arr[temp];
            arr[temp] = swap;
            //System.out.println(arr[temp]);
        }
        printArray(arr);

    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
}
