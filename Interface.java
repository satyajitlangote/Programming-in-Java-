import java.util.Scanner;
interface Shap
{
    public double area();
}
class Circle implements Shap
{
    double radius;
    public Circle (double r)
    {
        radius=r;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
}
class Rectangle implements Shap
{
    double length;
    double breadth;
    public Rectangle (double l, double b)
    {
        length=l;
        breadth=b;
    }
    public double area()
    {
        return length*breadth;
    }
}
class Interface
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Radius of Circle: ");
        double r= sc.nextDouble();
        Circle c= new Circle(r);
        double a1= c.area();
        System.out.println("Area of Circle :" +a1);
        System.out.println("Enter Length of Rectangle: ");
        double l1 = sc.nextDouble();
        System.out.println("Enter Breadth of Rectangle: ");
        double b1 = sc.nextDouble();
        Rectangle b= new Rectangle (l1, b1);
        double a2= b.area();
        System.out.println("Area of rectangle :"+ a2);
    }
}
