import java.util.Scanner;
public class Big3Num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter is A Value");
        int a=sc.nextInt();
        System.out.println("Enter is B value");
        int b=sc.nextInt();
        System.out.println("Enter is C value");
        int c=sc.nextInt();
        if((a>b) && (a>c))
        {
            System.out.println("A is Bigger");

        }
        else if((b>a) && (b>c))
        {
            System.out.println("B is Bigger");

        }
        else if((c>a) && (c>b))
        {
            System.out.println("C is Bigger");

        }
        else{
            System.out.println("All are equal");
        }
    }
}
