class A
{
public int x=10;
}
class B extends A
{
public int X=20;
public void showvalues()
{
System.out.println("value of x is"+x);
System.out.println("value of x is"+x);
}
}
class MethodOverride1
{
public static void main(String args[])
{
B bobj=new B();
bobj.showvalues();
}
}
