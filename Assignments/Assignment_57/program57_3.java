import java.io.*;
import java.util.*;

class program57_3
{
    public static void main(String A[]) throws Exception 
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        String DictName = sobj.nextLine();

        File fobj = new File(DictName);

        if(fobj.exists())
        {
            System.out.println("Directory is already exists");
        }
        else
        {
            bRet = fobj.mkdir();
            if(bRet == true)
            {
                System.out.println("Directory created successfully");
            }
            else
            {
                System.out.println("Unable to create directory");
            }
            
        }

        sobj.close();
    }
    
}