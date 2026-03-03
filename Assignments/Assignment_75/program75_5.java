import java.util.*;

class program75_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int AnnualIncome = 0;
        double PayableTax = 0;

        System.out.println("Enter your annual income : ");
        AnnualIncome = sobj.nextInt();

        if(AnnualIncome < 0)
        {
            System.out.println("Income cannot be negative");
            return;
        }

        System.out.println("Annual income : " + AnnualIncome);

        if(AnnualIncome <= 250000)
        {
            PayableTax = 0;
        }
        else if(AnnualIncome <= 500000)
        {
            PayableTax = (AnnualIncome - 250000) * 0.05;
        }
        else if(AnnualIncome <= 1000000)
        {
            PayableTax = (250000 * 0.05) + (AnnualIncome - 500000) * 0.20;
        }
        else
        {
            PayableTax = (250000 * 0.05) + (500000 * 0.20) + (AnnualIncome - 1000000) * 0.30;
        }

        System.out.println("Total Tax Payable : " + PayableTax);

        sobj.close();
    }
}