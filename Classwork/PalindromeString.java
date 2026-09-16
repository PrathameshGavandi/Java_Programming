import java.util.Scanner;

class PalindromeString
{
    public static void main(String A[])
    {
        String sValue = "", Reversed = "", Temp = null;
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        sValue = sobj.nextLine();

        Temp = sValue;

        for(iCnt = sValue.length() - 1; iCnt >= 0; iCnt--)
        {
            Reversed = Reversed + sValue.charAt(iCnt);
        }

        if(Reversed.equals(Temp))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }

    }
}