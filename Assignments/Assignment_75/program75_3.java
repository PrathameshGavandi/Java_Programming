import java.util.*;

class program75_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int CurrentStock = 0;
        int RequestedQuantity = 0;

        System.out.println("Enter current stock : ");
        CurrentStock = sobj.nextInt();

        System.out.println("Enter requested quantity : ");
        RequestedQuantity = sobj.nextInt();

        if(CurrentStock < 0)
        {
            System.out.println("Stock cannot be negative");
            return;
        }

        if(RequestedQuantity <= 0)
        {
            System.out.println("Requested quantity must be greater than 0");
            return;
        }

        if(RequestedQuantity > CurrentStock)
        {
            System.out.println("Order Failed : Insufficient Stock");
        }
        else
        {
            CurrentStock = CurrentStock - RequestedQuantity;
            System.out.println("Order Processed Successfully");
            System.out.println("Remaining Stock : " + CurrentStock);

            if(CurrentStock < 5)
            {
                System.out.println("Low Stock Alert!");
            }
        }

        
        
        sobj.close();
    }
}