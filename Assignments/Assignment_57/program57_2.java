import java.io.*;
import java.util.*;

class program57_2
{
    public static void main(String A[]) throws Exception 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            if(fobj.isFile())
            {
                System.out.println("It is regular file");
            }
            else
            {
                System.out.println("It is not a regular file");
            }
        }
        else
        {
            System.out.println("File does not exists");
        }

        sobj.close();
    }
    
}