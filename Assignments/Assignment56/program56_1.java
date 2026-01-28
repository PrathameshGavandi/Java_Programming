import java.util.*;
import java.io.*;

class Logic
{
    static void openfile(String filename)
    {
        try
        {
            File file = new File(filename);

            if(file.exists())
            {
                System.out.println("File successfully opened");
            }
            else
            {
                System.out.println("Unable to open file");
            }
        }
        catch (Exception eobj)
        {
            System.out.println("Error : " + eobj);
        }
    }
}

class program56_1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter File name :");
        String name = sobj.nextLine();

        obj.openfile(name);
        
    }
}
