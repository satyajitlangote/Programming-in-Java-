import java.util.Scanner;
public class SacnnerDemo1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    
       
        

        System.out.println("Name :-");
        String name=sc.nextLine();
        System.out.println("Gender :-");
        char gender=sc.next().charAt(0);
        System.out.println("Age :- ");
        int age=sc.nextInt();
        System.out.println("Mobile :-");
        long mobileno=sc.nextLong();
        System.out.println("CGPA :-");
        double cgpa=sc.nextDouble();
    }
}