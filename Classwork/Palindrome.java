import java.util.Scanner;

class Palindrome
{
    public static void main(String A[])
    {
        int iValue = 0, iDigit = 0, iRev = 0, Temp = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Temp = iValue;

        while(iValue != 0)
        {
            iDigit = iValue % 10;

            iRev = (iRev * 10) + iDigit;

            iValue = iValue / 10;
        }

        if(iRev == Temp)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }

    }
}