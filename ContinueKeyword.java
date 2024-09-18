class ContinueKeyword
{
    public static void main(String args[])
    {
        int [] numbers={10,20,30,40,50};
        for(int x: numbers )
        {
            if(x == 20)
            {
                continue;
            }
            System.out.println(x);
            System.out.println("  ");
        }
    }
}