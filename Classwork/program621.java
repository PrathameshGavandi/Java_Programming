import java.util.*;

class program621
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int no = sobj.nextInt();
        int iDigit = 0;
        int iCount = 0;

        while (no != 0) 
        {
            iDigit = no % 2;
            
            iCount = iCount + iDigit;

            no = no /2;
            
        }

        System.out.println("Number of 1's are : " + iCount);

    }
}