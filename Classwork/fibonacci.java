import java.util.*;

class fibonacci 
{
    public static void main(String A[]) 
    {
        int input = 10;
        int firstno = 0, secondno = 1, next = 0;

        for (int i = 1; i <= input; i++) 
        {
            next = firstno + secondno;

            System.out.println(firstno);

            firstno = secondno;
            secondno = next;
        }
    }

}