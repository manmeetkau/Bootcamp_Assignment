package Assignment1;

import java.util.Scanner;
class Sum {

    static int m = 4;
    static int n = 4;

    public Sum(int m, int n) {
        this.m=m;
        this.n=n;
    }


    // Function to calculate sum of each row
    static void row_sum(int arr[][])
    {

        int i, j, sum = 0;

        System.out.print("\nFinding Sum of each row:\n");

        // finding the row sum
        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {

                // Add the element
                sum = sum + arr[i][j];
            }

            // Print the row sum
            System.out.println("Sum of the row " + i + " = "
                    + sum);

            // Reset the sum
            sum = 0;
        }
    }

    // Function to calculate sum of each column
    static void column_sum(int arr[][])
    {

        int i, j, sum = 0;

        System.out.print(
                "\nFinding Sum of each column:\n");

        // finding the column sum
        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {

                // Add the element
                sum = sum + arr[j][i];
            }

            // Print the column sum
            System.out.println("Sum of the column " + i
                    + " = " + sum);

            // Reset the sum
            sum = 0;
        }
    }


    public static void main(String[] args)
    {
        int i, j;
        int[][] arr = new int[m][n];
        Scanner sc=new Scanner(System.in);
        //the matrix elements
        System.out.println("enter row and column=");
        m=sc.nextInt();
        n=sc.nextInt();
        Sum sm=new Sum(m,n);
        for (i = 0; i < m; i++)
        {
            System.out.println("Enter value for row "+i);

            for (j = 0; j < n; j++)

                arr[i][j] = sc.nextInt();
        }

        row_sum(arr);


        column_sum(arr);
    }
}