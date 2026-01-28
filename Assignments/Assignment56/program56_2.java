import java.util.*;
import java.io.*;

class Logic
{
    static void displaycontent(String filename)
    {
        try
        {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String content;

            System.out.println("File contents are : ");

            while((content = br.readLine()) != null)
            {
                System.out.println(content);
            }
        }
        catch (Exception eobj)
        {
            System.out.println("Error : " + eobj);
        }

    }


}

class program56_2
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter File name :");
        String name = sobj.nextLine();

        obj.displaycontent(name);
        
    }
}