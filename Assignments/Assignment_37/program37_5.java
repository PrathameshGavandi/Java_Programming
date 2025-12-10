import java.util.*;


class StringX
{
    public String StrRev(String str)
    {
        int iCnt = 0;
        String reversed = "";
        for(iCnt = str.length() -1; iCnt >= 0; iCnt--)
        {
            reversed += str.charAt(iCnt);       
        }
        return reversed;
    }
}
class program37_5
{
    public static void main(String A[])
    {
        String sRet = null;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String str = scanobj.nextLine();

        StringX classobj = new StringX();
        sRet = classobj.StrRev(str);

        System.out.println("reversed String is : " + sRet);


    }
}