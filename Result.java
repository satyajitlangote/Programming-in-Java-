import java.util.Scanner;
public class Result
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Your Name:");
        String Name=sc.nextLine();
        
        System.out.println("Mother's Name:");
        String MName=sc.next();
        
        System.out.println("Enter Your University PRN:");
        int PRN=sc.nextInt();
        
        System.out.println("Seat No:");
        int SN=sc.nextInt();
        
        System.out.println("College:");
        String Clg=sc.next(); 
        
        System.out.println("Exam Center:");
        String EC=sc.next();

        System.out.println(" ");
        System.out.println("--------------------------SUBJECTS MARKS INPUT---------------------------------");

        System.out.println("Enter FOC theory(80) & Termwork(20) marks:");
        int TH=sc.nextInt();
        int TW=sc.nextInt();
        int  M =TH+TW;

        System.out.println("Enter C theory(80) & Termwork(20) marks:");
        int TH1=sc.nextInt();
        int TW1=sc.nextInt();
        int  M1=TH1+TW1;

        System.out.println("Enter POM theory(80) & Termwork(20) marks:");
        int TH2=sc.nextInt();
        int TW2=sc.nextInt();
        int  M2=TH2+TW2;

         System.out.println("Enter BC theory(80) & Termwork(20) marks:");
        int TH3=sc.nextInt();
        int TW3=sc.nextInt();
        int  M3=TH3+TW3;
        
         System.out.println("Enter OA theory(80) & Termwork(20) marks:");
        int TH4=sc.nextInt();
        int TW4=sc.nextInt();
        int  M4=TH4+TW4;

        System.out.println("");
        System.out.println("-------------------------PRACTICALS MARKS INPUT--------------------------------");

        System.out.println("Lab Course-I Marks:");
        int L=sc.nextInt();
        System.out.println("Lab Course-II Marks:");
        int L1=sc.nextInt();
        System.out.println("Skill Devlopment Marks:");
        int SD=sc.nextInt();
     
        int total=M+M1+M2+M3+M4+L+L1+SD;
        
       
        
        System.out.println("");
        System.out.println(""); 
        System.out.println("                       SHIVAJI UNIVERSITY,KOLHAPUR         ");
        System.out.println("  Online Statement Of Marks For:BCA(CBCS)Part1 Sem 1(NEP 2020)(Semester1)");
        System.out.println("                        Examination:October-2022");
        System.out.println("");
        
        System.out.println("Name:"+Name);
        System.out.println("Mother's Name:"+MName);
        System.out.println("University PRN:"+PRN+"                     "+"Seat No:"+SN);
        
        System.out.println("College:"+Clg);
        System.out.println("Exam Center:"+EC);

        System.out.println("|------------------------------------|------------------------|---------------|");
        System.out.println("|                                    |      Category          |   Subject     |");
        System.out.println("|------------------------------------|------------------------|---------------|");
        System.out.println("|Paper Code| Paper/Subject Name      |Category|Marks |Result  |M/s  | R/t     |");
        System.out.println("|----------|-------------------------|--------|------|--------|-----|---------|");
        System.out.println("|BCA(CBCS)Part 1 Sem 1 (NEP 2020)                                             |");
        System.out.println("|----------|-------------------------|--------|-------|-------|------|--------|");
        System.out.println("|          |                         | Theory |"+TH+"     |       |"+M+"    |        |");
        System.out.println("| 88341    | Fundamentals Of         |--------|-------|-------|------|--------|");
        System.out.println("|          |      Computer           |TermWork|"+TW+"     |       |      |        |");
        System.out.println("|----------|-------------------------|--------|-------|-------|------|--------|");
        System.out.println("|          | Introduction To         | Theory |"+TH1+"     |       |"+M1+"    |        |");
        System.out.println("| 88342    |  Programming Using C    |--------|-------|-------|------|--------|");
        System.out.println("|          |                         |TermWork|"+TW1+"     |       |      |        |");
        System.out.println("|----------|-------------------------|--------|-------|-------|------|--------|");
        System.out.println("|          |                         | Theory |"+TH2+"     |       |"+M2+"    |        |");
        System.out.println("| 88343    | Principles Of           |--------|-------|-------|------|--------|");
        System.out.println("|          |      Management         |TermWork|"+TW2+"     |       |      |        |");
        System.out.println("|----------|-------------------------|--------|-------|-------|------|--------|");
        System.out.println("|          |                         | Theory |"+TH3+"     |       |"+M3+"    |        |");
        System.out.println("| 88344    | Business Communication  |--------|-------|-------|------|--------|");
        System.out.println("|          |                         |TermWork|"+TW3+"     |       |      |        |");
        System.out.println("|----------|-------------------------|--------|-------|-------|------|--------|");
        System.out.println("|          |                         | Theory |"+TH4+"     |       |"+M4+"    |        |");
        System.out.println("| 88345    | Office Automation       |--------|-------|-------|------|--------|");
        System.out.println("|          |                         |TermWork|"+TW4+"     |       |      |        |");
        System.out.println("|----------|-------------------------|--------|-------|-------|------|--------|");
        System.out.println("| 88346    |Lab Course 1Based CC 102 |practicl|"+L+"     |       |"+L+"    |        |");
        System.out.println("|----------|-------------------------|--------|-------|-------|------|--------|");
        System.out.println("| 88347    |Lab Course 2Based AEC 105|Practicl|"+L1+"     |       |"+L1+"    |        |");
        System.out.println("|----------|-------------------------|--------|-------|-------|------|--------|");
        System.out.println("| 88348    |Democracy,Election & GG  |Internal|"+SD+"     |       |"+SD+"    |        |");
        System.out.println("|----------|-------------------------|--------|-------|-------|------|--------|");
        System.out.println("| TOTAL =                                                       :"+total+"          |");
        System.out.println("|----------|-------------------------|--------|-------|-------|------|--------|");


        System.out.println("                                             "+total+" "+"Out Of 650");
        double result=total/6.5;
        System.out.println("                                              RESULT:"+result);
        if(result>=70 )
           {
             System.out.println("                                                  PASS");
             System.out.println("                                                  Dict");
           }
        else
        if(result>=60 && result<70)
          {
            System.out.println("                                                   PASS");
            System.out.println("                                               1st Class");
          }

        else
        if(result>=50 && result<60)
          {
             System.out.println("                                                  PASS");
             System.out.println("                                             2nd Class");
          }
        else
           System.out.println("                                                     FAIL");
          
          double cgpa=result/9.5;
          System.out.println("                                                               CGPA:"+cgpa);
        
    }
}           