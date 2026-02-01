import java.io.*;
import java.util.*;

class program58_3
{
    public static void main(String A[]) throws Exception 
    {
        int iRet = 0;

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        String DictName = sobj.nextLine();

        
        File fobj = new File(DictName);

        byte Buffer[] = new byte[100];

        if(fobj.exists() && fobj.isDirectory())
        {
            File fileslist[] = fobj.listFiles();

            File Destfile = new File("Marvellous.txt");
            Destfile.createNewFile();

            foobj = new FileOutputStream(Destfile);
            

            for(int i = 0; i < fileslist.length; i++)
            {
                if(fileslist[i].isFile())
                {
                    fiobj = new FileInputStream(fileslist[i]);

                    while ((iRet = fiobj.read(Buffer)) != -1) 
                    {
                        foobj.write(Buffer,0,iRet);
                    }

                    fiobj.close();
                }
            }

            foobj.close();
            System.out.println("File data written successfully into Marvellous.txt");
        }
        else
        {
            System.out.println("Invalid Directory name");
        }

        sobj.close();
    }
    
}