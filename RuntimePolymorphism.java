class Bike
{
    void run()
    {
        System.out.println("running ");
    }
}
class Splender extends Bike
{
    void run()
    {
        System.out.println("running safely with 60 km ");
    }
}
class RuntimePolymorphism
{    public static void main(String args[])
    {
        Bike b=new Splender();
        b.run();
    }
}