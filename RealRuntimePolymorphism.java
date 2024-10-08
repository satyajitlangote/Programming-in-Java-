class BCA 
{
    int getAttendence()
    {
        return 0;
    }
}
class BCAI extends BCA
{
    int getAttendence()
    {
        return 85;
    }
}
class BCAII extends BCA
{
    int getAttendence()
    {
        return 70;
    }
}
class BCAIII extends BCA
{
    int getAttendence()
    {
        return 90;
    }
}
class RealRuntimePolymorphism
{
    public static void main(String args[])
    {
        BCA b1=new BCAI();
        BCA b2=new BCAII();
        BCA b3=new BCAIII();
        System.out.println("BCA I Attendence "+b1.getAttendence());
        System.out.println("BCA II Attendence "+b2.getAttendence());
        System.out.println("BCA II Attendence "+b3.getAttendence());
    }
}