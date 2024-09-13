class SwitchStatement 
{
    public static void main(String args[])
    {
        char grade='G';
        switch(grade)
        {
            case 'A':
            System.out.println("Execellent ");
            break;
            case 'B':
            System.out.println("Well Done ");
            break;
            case 'C':
            System.out.println(" You Passed ");
            break;
            case 'D':
            System.out.println("Better try ");
            break;
            case 'E':
            System.out.println("Crack to very Small ");
            break;
            default:
            System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " +grade);
    }
}