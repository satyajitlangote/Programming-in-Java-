## Using the user defined exceptions in java.
User Defined Exceptions
class MyDivException extends Exception 
{ 
    public MyDivException(String message) {
        super(message);
    }
}

class Tester
{
    public static void divide(int x, int y) throws MyDivException {
        if(y == 0)
           throw new MyDivException("The divisor should not be zero");
        int z = x/y;
            System.out.println(z);
    }
    
    public static void main(String[] args)
    {
        try
        {
        divide(6,0);
        }catch(MyDivException e) {
            System.out.println(e.getMessage());
        }
    }
}

