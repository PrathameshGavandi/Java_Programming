import java.util.*;

class StringX
{
    public int CountWhite(String str)
    {
        char Arr[] = str.toCharArray();

        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] == ' '))
            {
                iCount++;
            }
            
        }
        return iCount;
    }
}
class program36_5
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String str = scanobj.nextLine();

        StringX classobj = new StringX();
        iRet = classobj.CountWhite(str);

        System.out.println("Count of WhiteSpaces is : " + iRet);
    }
}