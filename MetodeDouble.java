class Calculation2
{
    void sum(int a,int b,int c)
    {
        System.out.println(a+b);
    }
    void sum(double a,double b)
    {
        System.out.println(a+b);

    }
    void sum(char x,char y)
    {
        System.out.println(x+y);
    }
}
public class MethodDouble
{
    public static void main(String args[])
    {
        Calculation2 obj=new Calculation2();
        obj.sum(10.5,7.5);
        obj.sum(20,5);
        obj.sum('a','b');
    }
}
