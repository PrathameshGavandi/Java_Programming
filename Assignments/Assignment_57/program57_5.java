import java.io.*;
import java.util.*;

class program57_5
{
    public static void main(String A[]) throws Exception 
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        String DictName = sobj.nextLine();

        File fobj = new File(DictName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fileslist[] = fobj.listFiles();

            System.out.println("Files in directory are : ");

            for(int i = 0; i < fileslist.length; i++)
            {
                System.out.println("File Name : " + fileslist[i].getName() + "  File Size : " + fileslist[i].length() + " bytes");
            }
        }
        else
        {
            System.out.println("Invalid Directory name");
        }

        sobj.close();
    }
    
}