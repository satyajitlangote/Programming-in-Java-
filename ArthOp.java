import java.util.Scanner;
public class  ArthOp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1 Addition");
        System.out.println("2 Subsraction ");
        System.out.println("3 Multiplication");
        System.out.println("4 Divission");
        System.out.println("Enter 1st Number ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number ");
        int b=sc.nextInt();
        System.out.println(" Enter your Choice");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Addition "+(a+b));
        }
        else if(ch==2)
        {
            System.out.println("Subtraction "+(a-b));
        }
        else if(ch==3)
        {
            System.out.println("Multiplication"+(a*b));
        }
        else if(ch==4)
        {
            System.out.println("Divission "+(a/b));
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    }
}