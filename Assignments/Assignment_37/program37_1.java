import java.util.*;


class StringX
{
    public boolean ChkChar(String str, char ch)
    {
        char Arr[] = str.toCharArray();

        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] == ch))
            {
                return true; 
            }
            
        }
        return false;

    }
}
class program37_1
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String str = scanobj.nextLine();

        System.out.println("Enter a Character :");
        char ch = scanobj.next().charAt(0);

        StringX classobj = new StringX();
        bRet = classobj.ChkChar(str,ch);

        if(bRet == true)
        {
            System.out.println("Character found");
        }
        else
        {
            System.out.println("Character not found");
        }
    }
}
