import java.util.*;


class StringX
{
    public int CountChar(String str, char ch)
    {
        char Arr[] = str.toCharArray();

        int iCnt = 0, iIndex = 0;

        for(iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] == ch))
            {
                iIndex = iCnt;
            }
            
        }
        if(iIndex > 0)
        {
            return iIndex;
        }
        else
        {
            return -1;
        }
        

    }
}
class program37_4
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String str = scanobj.nextLine();

        System.out.println("Enter a Character :");
        char ch = scanobj.next().charAt(0);

        StringX classobj = new StringX();
        iRet = classobj.CountChar(str,ch);

        System.out.println("Character location is : " + iRet);


    }
}