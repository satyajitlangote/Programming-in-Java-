import java.util.Scanner;
public class BubbleSort 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,temp;
        System.out.println("Enter size of array");
        n=sc.nextInt();
        int a[]=new int[10];
        System.out.println("Enter array values ");
        for(i=0;i<=n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Dispaly the element of an array ");
        for(i=0;i<=n;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println();
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=n;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }        
        System.out.println("Bubble sorted elements are");
        for(i=0;i<=n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }    
}
