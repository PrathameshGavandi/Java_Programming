import java.util.*;

class program75_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Helmet = null;
        String License = null;
        String Speeding = null;

        int Fine = 0;

        System.out.println("Helmet worn (Yes/No) : ");
        Helmet = sobj.next();

        System.out.println("License available (Yes/No) : ");
        License = sobj.next();
        
        System.out.println("OverSpeeding (Yes/No) : ");
        Speeding = sobj.next();

        
        if(!(Helmet.equalsIgnoreCase("Yes") || Helmet.equalsIgnoreCase("No")) ||
        !(License.equalsIgnoreCase("Yes") || License.equalsIgnoreCase("No")) ||
        !(Speeding.equalsIgnoreCase("Yes") || License.equalsIgnoreCase("No"))
        )
        {
            System.out.println("Inputs must be Yes/No only");
            return;
        }


        if(Helmet.equalsIgnoreCase("No"))
        {
            Fine = Fine + 500;
        }
        if(License.equalsIgnoreCase("No"))
        {
            Fine = Fine + 1000;
        }
        if(Speeding.equalsIgnoreCase("Yes"))
        {
            Fine = Fine + 1500;
        }

        System.out.println("Total Fine Amount : " + Fine);

        sobj.close();
    }
}