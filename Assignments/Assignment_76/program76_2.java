package Assignment76;

import java.util.*;

class program76_2 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Marks = 0;
        int Attendance = 0;
        int Income = 0;

        System.out.println("Enter percent : ");
        Marks = sobj.nextInt();

        System.out.println("Enter attendance percent : ");
        Attendance = sobj.nextInt();

        System.out.println("Enter family income : ");
        Income = sobj.nextInt();

        if((Marks < 0 || Marks > 100) || (Attendance < 0 || Attendance > 100))
        {
            System.out.println("Marks and attendance must between 0 to 100");
            return;
        }

        if(Income < 0)
        {
            System.out.println("Income cannot be negative");
            return;
        }


        if(Marks < 80)
        {
            System.out.println("Scholarship Rejected : Marks below 80%");
        }
        else if(Attendance < 75)
        {
            System.out.println("Scholarship Rejected : Attendance  below 75%");
        }
        else if(Income > 300000)
        {
            System.out.println("Scholarship Rejected : Income is above 3 lakh");
        }
        else
        {
            System.out.println("Scholarship Approved");
        }

        sobj.close();
    }
}