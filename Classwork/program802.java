import java.util.*;
class program802
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int size = 0;

        System.out.println("Enter how many elemts you want");
        size = sobj.nextInt();

        int i = 0,First = 0,Second = 1,Next = 0;


        for(i = 0, First = 0, Second = 1; i <= size; i++)
        {
            Next = First + Second;
            System.out.print(First + " ");
            Second = First;
            First = Next;
        }

    }
}