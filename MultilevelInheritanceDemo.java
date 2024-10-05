//2.	Multilevel Inheritance:
class A
{
int a,b;
void display(){
System.out.println(a+" "+b);
}
}
class B extends A{
int c;
void show(){
System.out.println(a+" "+b+" "+c);
}
}
class c extends B{
int d;
void shows()
{
System.out.println(a+" "+b+" "+c+" "+d);
}
}
public class MultilevelInheritanceDemo{
public static void main(String args[]){
c obj=new c();
obj.a=10;
obj.b=20;
obj.c=30;
obj.d=40;
obj.display();
obj.show();
obj.show();
}
}
