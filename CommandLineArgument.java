import java.lang.*;
class CommandLineArgument
{
	public static void main(String args[])
	{
		int a,b,c,d;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		d=a+b+c;
		System.out.println("1st argument is : "+args[0]);
		System.out.println("2nd argument is : "+args[1]);
		System.out.println("3rd argument is : "+args[2]);
		System.out.println("Sum is : "+d);
	}
}
