import java.io.*;
import java.util.*;
import java.util.zip.CRC32;

class program57_4
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            CRC32 cobj = new CRC32();
            byte Buffer[] = new byte[1024];
            int iRet = 0;

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                cobj.update(Buffer, 0, iRet);
            }

            System.out.println("Checksum of file is : " + cobj.getValue());

            fiobj.close();
        }
        else
        {
            System.out.println("File does not exist");
        }

        sobj.close();
    }
}
