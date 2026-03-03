package Assignment76;

import java.util.*;

class program76_5
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Percentage = 0;

        System.out.println("Enter battery percentage : ");
        Percentage = sobj.nextInt();

        if(Percentage < 0 || Percentage > 100)
        {
            System.out.println("Percentage must between 1 to 100 only");
        }


        System.out.println("Battery Percentage : " + Percentage + " %");
        if(Percentage <= 5)
        {
            System.out.println("Status : Critical");
        }
        else if(Percentage <= 15)
        {
            System.out.println("Status : Low");
        }
        else
        {
            System.out.println("Status : Normal");
        }
        
        sobj.close();
    }
}