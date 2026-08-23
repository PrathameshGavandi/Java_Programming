import java.util.*;

class FindMaxMin
{
    public static void main(String A[])
    {
        ArrayList<Integer> aobj = new ArrayList<Integer>();

        aobj.add(10);
        aobj.add(20);
        aobj.add(30);
        aobj.add(40);

        int Max = aobj.get(0);
        int Min = aobj.get(0);

        for(int no : aobj)
        {
            if(no > Max)
            {
                Max = no;
            }
            if(no < Min)
            {
                Min = no;
            }
        }

        System.out.println("Maximum Elemtnt : " + Max);

        System.out.println("Munumum Element : " + Min);

    }
}