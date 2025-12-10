import java.util.*;

class StringX
{
    public String struprX(String str)
    {
        char Arr[] = str.toCharArray();

        int iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
            
        }

        return new String(Arr);
        
    }
}
class program36_2
{
    public static void main(String A[])
    {
        String sRet = null; 
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String str = scanobj.nextLine();

        StringX classobj = new StringX();
        sRet = classobj.struprX(str);

        System.out.println("Updated String is : " + sRet);
    }
}