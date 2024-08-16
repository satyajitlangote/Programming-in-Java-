class Calculation
{
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(int a,int b,int c)
    {
        System.out .println(a+b+c);
    }
}
public class Method3
{
    public static void main(String args[])
    {
        Calculation obj=new Calculation();
        obj.sum(10,4.130);
        obj.sum(10,30);
    }
}