import java.util.*;
import java.io.*;

class Logic
{
    static void createFile(String filename)
    {
        try
        {
            File file = new File(filename);     //ही line file चा object तयार करते.
                                                //हा object वापरून Java ला file create करणे, open करणे किंवा check करणे शक्य होते.

            if(file.exists())
            {
                System.out.println("File is already exists");
            }
            else
            {
                file.createNewFile();   //Method for create new file
                System.out.println("File created successfully");
            }
        }
        catch (Exception eobj)
        {
            System.out.println("Error : " + eobj);
        }

    }


}

class program56_4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter File name :");
        String name = sobj.nextLine();

        obj.createFile(name);
        
    }
}