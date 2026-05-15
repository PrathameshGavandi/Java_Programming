import java.util.*;

class program835
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iNo++;

        double ans = (int)Math.sqrt(iNo);

        if(iNo == (ans * ans))
        {
            System.out.println((iNo - 1) + " is sunny number");
        }
        else
        {
            System.out.println((iNo - 1) + " is not sunny number");
        }
    }
    
}
