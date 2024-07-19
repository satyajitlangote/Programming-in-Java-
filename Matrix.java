import java.util.Scanner;
public class Matrix 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a values into a matrix");
        int a[][]=new int[2][2];
        int i,j;
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix reperesentation ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}