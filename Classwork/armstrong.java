import java.util.*;

class armstrong
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRem = 0, iAns = 0, temp = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();
        
        temp = iValue;

        while(iValue > 0)
        {
            iRem = iValue % 10;

            iAns = iAns + (iRem * iRem * iRem);

            iValue = iValue / 10;
        }

        if(iAns == temp)
        {
            System.out.println("Number is armstrong");
        }
        else
        {
            System.out.println("Number is not armstrong");
        }

    }
}