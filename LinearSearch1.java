import java.util.Scanner;
public class LinearSearch1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        int b[]=new int[5];
        System.out.println("Enter the value of an array");
        for(int i=0;i<5;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(b[i]+"  ");
        }
        System.out.println("Enter value to search ");
        int se=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            if(se==b[i])
            flag++;
        }
        if(flag==1)
        {
            System.out.println("Search Found");
        }
        else 
        {
            System.out.println("Serach not Found");
        }
    }
}