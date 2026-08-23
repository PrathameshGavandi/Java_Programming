import java.util.*;

class EvenOddSepration
{
    public static void main(String A[])
    {
        ArrayList<Integer> aobj = new ArrayList<Integer>();

        aobj.add(1);
        aobj.add(2);
        aobj.add(3);
        aobj.add(4);
        aobj.add(5);
        aobj.add(6);
        aobj.add(7);
        aobj.add(8);
        aobj.add(9);
        aobj.add(10);


        ArrayList<Integer> evenlist = new ArrayList<Integer>();
        ArrayList<Integer> oddlist = new ArrayList<Integer>();

        for(int no : aobj)
        {
            if(no % 2 == 0)
            {
                evenlist.add(no);
            }
            else
            {
                oddlist.add(no);
            }
        }

        System.out.println("Even Numbers List : " + evenlist);
        System.out.println("Odd Numbers List : " + oddlist);
    }
}