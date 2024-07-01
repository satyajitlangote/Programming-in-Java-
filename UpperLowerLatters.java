import java.util.Scanner;
public class UpperLowerLatters
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z')
        {
            System.out.println("Upper Case ");
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.println("Lower Case");
        }
        else
        {
            System.out.println("Invalid Cases");
        }
    }
}
