class Room
{
	float length, breadth;
	Room(float a, float b)
	{
		length=a;
		breadth=b;
	}
	Room(float x)
	{
		length= breadth=x;
	}
	float area()
	{
		return(length*breadth);
	}
}
public class MethodOverLoading
{
	public static void main (String[]args)
	{
		Room room=new Room(25.0F,12.0F);
		Room room1=new Room(20.0F);
		float area1=room.area();
		System.out.println("Area of Room 1: "+area1);
		float area2=room1.area();
		System.out.println("Area of Room2: "+area2);
	}
}
