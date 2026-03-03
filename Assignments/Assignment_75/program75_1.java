import java.util.*;

class program75_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter total hours : ");
        int Hours = sobj.nextInt();

        int Amount = 0;

        if(Hours < 0)
        {
            System.out.println("Hours cannot be negative");
            return;
        }

        System.out.println("Total Parking Duration : " + Hours + " Hours");

        if(Hours <= 2)
        {
            Amount = 20;
        }
        else if(Hours > 2 && Hours <= 10)
        {
            Amount = 20 + ((Hours - 2) * 10);
        }
        else if(Hours > 10)
        {
            Amount = 20 + ((Hours - 2) * 10 ) + 50;
        }

        System.out.println("Total Parking Amount : " + Amount);
        
        sobj.close();
    }
}
