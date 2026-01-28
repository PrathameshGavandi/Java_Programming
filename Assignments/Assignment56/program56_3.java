import java.util.*;
import java.io.*;

class Logic
{
    static void writedata(String filename, String data)
    {
        try
        {
            FileWriter fw = new FileWriter(filename,true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.newLine();

            bw.write(data);


            bw.close();   // VERY IMPORTANT
            
            System.out.println("Data successfully written at the end of file");

        }
        catch (Exception eobj)
        {
            System.out.println("Error : " + eobj);
        }

    }


}

class program56_3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter File name :");
        String name = sobj.nextLine();

        System.out.println("Enter data you want to write : ");
        String data = sobj.nextLine();

        obj.writedata(name,data);
        
    }
}