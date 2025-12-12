import java.util.*;

class StringX
{
    public String StrToggleX(String str)
    {
        char Arr[] = str.toCharArray();

        int iCnt = 0;
        for(iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char) (Arr[iCnt] + 32);
            }
            else if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                Arr[iCnt] = (char) (Arr[iCnt] - 32);
            }
        }
        return new String(Arr);

    }    
    
}

class program256
{
    public static void main(String A[])
    {      
        String sRet = null;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter your String : ");
        String sobj = scanobj.nextLine();    

        StringX strobj = new StringX();
        sRet = strobj.StrToggleX(sobj);     

        System.out.println("Updated string is : " + sRet);
        
    }
}