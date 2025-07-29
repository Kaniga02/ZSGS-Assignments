/*Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m*/
package Day2.Part2;

import java.util.*;

public class transposeMatrix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        transposeMatrix mat=new transposeMatrix();

        System.out.println("Enter the no of rows : ");
        int m=sc.nextInt();
        System.out.println("Enter the no of columns : ");
        int n= sc.nextInt();


        int[][] matrix = new int[m][n];

        mat.inputGet(matrix,m,n);

    }
    public void inputGet(int[][] nums,int rows,int cols)
    {
        Scanner sc=new Scanner(System.in);
        for(int i = 0;i<rows;i++)
            for(int j=0;j<cols;j++)
                nums[i][j] = sc.nextInt();

        printElements(nums,rows,cols);
        
    }   //inoutget
    public void printElements(int[][] nums,int rows,int cols)
    {
        for(int i = 0;i<rows;i++){
            
            for(int j=0;j<cols;j++)
                System.out.print(nums[i][j]+"  ");
            System.out.println();
        }//for-i

        sumOfAllMatrixElements(nums,rows,cols);
    }//inputElements

    public void sumOfAllMatrixElements(int[][] nums,int rows,int cols)
    {
        int sum = 0;
        for(int i = 0;i<rows;i++)
            for(int j=0;j<cols;j++)
                sum += nums[i][j];

        System.out.println("Sum of all the elements : "+sum);
        sumOfAllrowsElements(nums,rows,cols);
    }//sumOfAllMatrixElements
    public void sumOfAllrowsElements(int[][] nums,int rows,int cols)
    {
        for(int i = 0;i<rows;i++)
        {
            int sum =0;
            for(int j=0;j<cols;j++)
                sum +=nums[i][j];
            System.out.println("Sum of all"+i+" Rows elements : "+sum);
        }//for
       sumOfAllcolsElements(nums,rows,cols);
    }//sumOfAllrowsElements
    public void sumOfAllcolsElements(int[][] nums,int rows,int cols)
    {
        for(int i = 0;i<cols;i++)
        {
            int sum =0;
            for(int j=0;j<rows;j++)
                sum +=nums[j][i];
            System.out.println("Sum of all "+i+"col elements : "+sum);
        }//for
        transpose(nums,rows,cols);
    }
    public void transpose(int[][] nums,int rows,int cols)
    {
        int[][] tranmat=new int[cols][rows];
        for(int i = 0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
                tranmat[j][i]=nums[i][j];
        }

        System.out.println("After Transpose : ");
        for(int i = 0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
                System.out.print(tranmat[i][j]+" ");
            System.out.println();
        }
        
    }


}
