import java.util.*;

class program74_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your current balance : ");
        int Current_Balance = sobj.nextInt();

        System.out.println("Please enter the amount that you want to withdrowl : ");
        int Withdrow_Amount = sobj.nextInt();

        if(Current_Balance < 0 || Withdrow_Amount <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(Withdrow_Amount % 100 != 0)
        {
            System.out.println("Transaction Failed : Withdrowl amount must be a multiple of 100");
        }
        else if(Withdrow_Amount > 25000)
        {
            System.out.println("Transaction Failed : Maximum withdrawl per transaction is 25,000");
        }
        else if(Current_Balance - Withdrow_Amount < 1000)
        {
            System.out.println("Transaction Failed : After withdrawl , balance must remain at least 1,000");
        }
        else
        {
            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance : " + (Current_Balance - Withdrow_Amount));
        }

    }
}
