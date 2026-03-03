package Assignment76;

import java.util.*;

class program76_1 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        String PeakHour = null;
        double TotalAmount = 0;
        int BaseFare = 50;

        System.out.println("Enter total distance in KM : ");
        Distance = sobj.nextInt();

        System.out.println("Peak hour (Yes/No) : ");
        PeakHour = sobj.next();

        if (Distance < 0) {
            System.out.println("Distance cannot be negative");
            return;
        }

        if (!(PeakHour.equalsIgnoreCase("Yes") || PeakHour.equalsIgnoreCase("No"))) 
        {
            System.out.println("Invalid Peak Hour input");
            return;
        }

        if (Distance <= 10) {
            TotalAmount = BaseFare + (Distance * 12);
        } else {
            TotalAmount = BaseFare + (10 * 12) + ((Distance - 10) * 15);
        }

        if (PeakHour.equalsIgnoreCase("Yes")) {
            TotalAmount = TotalAmount + (TotalAmount * 0.20);
        }

        System.out.println("Distance : " + Distance + " KM ");
        System.out.println("Peak Hour : " + PeakHour);
        System.out.println("Total Fare : " + TotalAmount);

        sobj.close();
    }
}
