import java.util.*;

class StringX
{
    public void DisplayDigits(String str)
    {
        char Arr[] = str.toCharArray();

        int iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] >= '0') && (Arr[iCnt] <= '9'))
            {
                System.out.println(Arr[iCnt]);
            }
            
        }
        
    }
}
class program36_4
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String str = scanobj.nextLine();

        StringX classobj = new StringX();
        classobj.DisplayDigits(str);
    }
}