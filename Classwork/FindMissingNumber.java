import java.util.*;

class FindMissingNumber
{
    public static void main(String A[])
    {
        int iArr[] = {5,6,7,9,10};

        int Start = 5;
        int End = 10;

        LinkedHashSet<Integer> sobj = new LinkedHashSet<Integer>();

        for(int Num : iArr)
        {
            sobj.add(Num);
        }

        for(int i = Start; i <= End; i++)
        {
            if(!sobj.contains(i))
            {
                System.out.println("The missing element is : " + i);
            }
        }
    }
}