class A
{
    public int x=10;
}
class B extends A 
{
    public int x=20;
    public void show_value()
    {
        System.out.println("Value of X is "+x);
        System.out.println("Value of X is "+x);
    }
}
class overideing1
{
    public static void main(String args[])
    {
        B obj=new B();
        obj.show_value();
    }
}