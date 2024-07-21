import java.util.Scanner;
public class Matrix2 
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int i,j;
            int a[][]=new int[2][2];
            System.out.println("Enter the values into a matrix");
            for(i=0;i<2;i++)
            {
                for(j=0;j<2;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println(" Upper traingle of a matrix");
            for(i=0;i<2;i++)
            {
                for(j=0;j<2;j++) 
                {
                    if(i<=j)
                    System.out.print(a[i][j]+"  ");
                    else
                    System.out.print("   ");
                }
                System.out.println( );
            }
        }
}
