abstract class Bike
{
    Bike()
    {
        Syste.out.println("Bike is created ");
    }
    abstact void run();
    void changeGear()
    {
        System.out.println("Gear Changed ");
    }
}
class Honda extends Bike{
    void run()
    {
        System.out.println("running safely ");
    }
}
class TestAbstraction2
{
    public static void main(String args[])
    {
        Bike obj=new Honda();
        obj.run();
        obj.changeGear();
    }
}