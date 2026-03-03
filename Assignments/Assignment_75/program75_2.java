import java.util.*;

class program75_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;
        int Income = 0;
        int CreditScore = 0;
        String Loan = null;

        System.out.println("Enter Age : ");
        Age = sobj.nextInt();

        System.out.println("Enter total income : ");
        Income = sobj.nextInt();

        System.out.println("Enter credit score : ");
        CreditScore = sobj.nextInt();

        System.out.println("You have an Existing unpaid loan(Yes/No)?");
        Loan = sobj.next();


        if(Age < 0 || Income < 0 || CreditScore < 0 )
        {
            System.out.println("Age/Income/Score must be non-negative");
            return;
        }

        
        if(!(Loan.equalsIgnoreCase("yes") || Loan.equalsIgnoreCase("no")))
        {
            System.out.println("yes/no must be valid");
            return;
        }

        
        if(Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected : Age limit doesent match");
            return;
        }
        else if(Income < 25000)
        {
            System.out.println("Loan Rejected : Monthly income is less than 25000");
            return;
        }
        else if( CreditScore < 700)
        {
            System.out.println("Loan Rejected : Credit score is less than 700");
            return;
        }
        else if( Loan.equalsIgnoreCase("Yes"))
        {
            System.out.println("Loan Rejected : You have an existing unpaid loan");
            return;
        }
        else
        {
            System.out.println("Loan Approved");
        }


        
        sobj.close();
    }
}