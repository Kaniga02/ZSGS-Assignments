//Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
//X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
package Part2;

public class TwoArraySameorNot {
        public static void main(String[] args)
        {
            char[] arr1 ={'m', 'n', 'o', 'p'};
            char[] arr2 ={'m', 'n', 'o', 'p'};
            boolean flag = true;
            for(int i=0;i<arr1.length;i++)
            {
                if(flag)
                {
                    for(int j=0;j<arr2.length;j++)
                        if(arr1[i]==arr2[j])
                            flag=true;

                }
                    
            }
            System.out.println(flag);

        }
    
}
