package Part2;

public class Marksheet {


    public static void main(String[] args)
    {
        int[][] std = {{1,56,78,43},{2,78,54,77},{3,87,90,45},{4,89,56,76},{5,87,45,65},{6,78,72,84},{7,92,54,62},{8,90,79,67},{9,89,87,90},{10,89,67,82}};
        for(int i=0;i<std.length;i++)
        {
            int totalMarks=0;
            for(int j=0;j<3;j++)
            {
                totalMarks +=std[i][j];

            }
            System.out.println(std[i][0]+" "+totalMarks+" "+totalMarks/3);
        }
    }
    
}
