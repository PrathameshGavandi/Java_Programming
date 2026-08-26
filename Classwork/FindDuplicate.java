import java.util.*;

class FindDuplicate
{
    public static void main(String A[])
    {
        int iArr[] = {1,2,3,4,5,6,7,8,3,4,5,3,9,3,3,3,3,10};

        HashMap<Integer, Integer> hobj = new HashMap<Integer, Integer>();

        for(int Num : iArr)
        {
            int old = 0;

            if(hobj.containsKey(Num))
            {
                old = hobj.get(Num);
                hobj.put(Num,old + 1);
            }
            else
            {
                hobj.put(Num,1);
            }
        }

        for(int Num : hobj.keySet())
        {
            if(hobj.get(Num) > 1)
            {
                System.out.println("Duplicate : " + Num);
            }
        }
    }
}