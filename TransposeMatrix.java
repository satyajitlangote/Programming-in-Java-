import java.util.Scanner;
public class TranposeMatrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int a[][]=new int[2][2];
        System.out.println("Enter the value into a matrix ");
        for(i=0;i<2;i++)
        {
            for(i=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();

            }
        }
        System.out.println("Matrix representation ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println(a[i][j]+ "   ");
            }
            System.out.println( );
        }
        System.out.println("Transpose of matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println(a[i][j]+"  ");
            }
            System.out.println( );
        }
    }
}