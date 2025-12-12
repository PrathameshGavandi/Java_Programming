import java.util.*;

class StringX
{
    public String ToLowerCaseX(String str)
    {
        char Arr[] = str.toCharArray();

        int iCnt = 0;
        for(iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char) (Arr[iCnt] + 32);
            }
        }
        return new String(Arr);

    }    
    
}

class program255
{
    public static void main(String A[])
    {      
        String sRet = null;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter your String : ");
        String sobj = scanobj.nextLine();    

        StringX strobj = new StringX();
        sRet = strobj.ToLowerCaseX(sobj);     

        System.out.println("Updated string is : " + sRet);
        
    }
}