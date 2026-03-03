package Assignment76;

import java.util.*;

class program76_4
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int BudgetAmount = 0, ItamesCount = 0, ItemPrices = 0, i = 0, iCount = 0;

        System.out.println("Enter your budget amount : ");
        BudgetAmount = sobj.nextInt();

        if(BudgetAmount < 0)
        {
            System.out.println("Budget amount must be greater than 0");
            return;
        }

        System.out.println("Enter number of items : ");
        ItamesCount = sobj.nextInt();

        if(ItamesCount < 0)
        {
            System.out.println("Invalid number of items");
            return;
        }

        int Arr[] = new int[ItamesCount];

        System.out.println("Enter item prices");

        for(i = 0; i < ItamesCount; i++)
        {
            Arr[i] = sobj.nextInt();

            if(Arr[i] <= 0)
            {
                System.out.println("Invalid price");
                return;
            }

        }

        for(i = 0; i < ItamesCount; i++)
        {
            if(Arr[i] <= BudgetAmount)
            {
                BudgetAmount = BudgetAmount - Arr[i];
                iCount++;
            }
            else
            {
                break;
            }

        }

        System.out.println("Items Purchased: " + iCount);
        System.out.println("Remaining Balance: ₹" + BudgetAmount);


        sobj.close();
    }
}