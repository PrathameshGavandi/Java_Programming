import java.util.*;
import java.io.*;

class Logic
{
    static void displayFiles(String dirname)
    {
        File dir = new File(dirname);

        if(dir.exists() && dir.isDirectory())
        {
            String files[] = dir.list();

            System.out.println("Files in directory are:\n");

            for(String name : files)
            {
                System.out.println(name);
            }
        }
        else
        {
            System.out.println("Directory does not exist.");
        }
    }
}

class program56_5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        String name = sobj.nextLine();

        Logic.displayFiles(name);
    }
}
