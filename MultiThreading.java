class MyThread extends Thread
{
	String name;
	MyThread(String n)
	{
		name=n;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(name+":"+i);
		try{
			this.sleep(1000);
		}catch(Exception e){}
		System.out.println(name+" finished");
	}
}
public class MultiThreading
{
	public static void main(String[]args)
	{
		MyThread a=new MyThread("Thread 1");
		MyThread b=new MyThread("Thread 2");
		a.start();
		b.start();
		try{
			a.join();
			b.join();
		}catch(Exception e){}
		System.out.println("Both Threads are finished");
	}
}
