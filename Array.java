 import java.util.Scanner;
 public class Array
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter the size of an array ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the element in the array");
        for(i=0;i<
        size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Arry Elemnt is"+size);
        for(i=0;i<size;i++);
        {
            System.out.println(a[i]+"   ");
        }
    }
 }
