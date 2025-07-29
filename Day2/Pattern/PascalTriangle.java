

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int i = 0;

        do {
            // Print leading spaces
            int space = rows - i;
            int s = 0;
            do {
                System.out.print(" ");
                s++;
            } while (s < space);

            int val = 1;
            int j = 0;
            do {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);  // Compute next value
                j++;
            } while (j <= i);

            System.out.println();
            i++;
        } while (i < rows);
        sc.close();

    }
}
