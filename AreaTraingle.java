import java.util.Scanner;
public class AreaTraingle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Height of traingle");
        double h=sc.nextDouble();
        System.out.println("Enter Base of traingle");
        double b=sc.nextDouble();
        double a=0.5*h*b;
        System.out.println("Area of Traingle\n " +a);
    }
}
