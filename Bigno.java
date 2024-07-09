import java.util.Scanner;
public class Bigno
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        System.out.println("Enter value of c");
        int c=sc.nextInt();
        if((a>b) && (a>c))
        {
            System.out.println("A is bigger ");
        }
        else if((b>a) && (b>c))
        {
            System.out.println("B is bigger ");
        }
        else if((c>a) && (c>b))
        {
            System.out.println("C is bigger ");
        }
        else 
        {
            System.out.println("All are equal ");
        }
    }
}