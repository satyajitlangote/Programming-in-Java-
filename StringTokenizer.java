import java.util.StringTokenizer;
public class StringTokenizer
{
    public static void main(String args[])
    {
        StringTokenizer obj=new StringTokenizer("Wel-Come to java programing "," ");
        while(obj.hasMoreTokens())
        {
            System.out.println(obj.nextToken());
        }
    }
}