import java.util.*;

class program626
{
    public static void main(String A[]) 
    {
        int iNo = 0, iMask = 0, iResult = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iMask = 4;

        iResult = iNo & iMask;

        if(iResult == 0)
        {
            System.out.println("Third bit is OFF");
        }
        else
        {
            System.out.println("Third bit is ON");
        }

    }
}
