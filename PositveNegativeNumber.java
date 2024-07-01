import java.util.Scanner;
public class PositveNegativeNumber
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter is a value ");
        int n=sc.nextInt();
        
        {
            System.out.println("Positive number");
        }
        else if(n<0)
        {
            System.out.println("Negative number");
        }
        else
        {
            System.out.println("Number are zero");
        }
    }
}
