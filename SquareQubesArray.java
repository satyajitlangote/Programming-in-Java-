public class SquareQubesArray
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int i;
        System.out.println("Value of an array");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Square and cube of values of array");
        for(i=0;i<=4;i++)
        {
            System.out.println(a[i]+"  "+a[i]*a[i]+"  "+a[i]*a[i]+a[i]);
        }
    }
}
