import java.util.*;

class MoveZeroEnd
{
    public static void main(String A[])
    {
        int iArr[] = {0,1,2,3,0,0,4,0,0,0,5};
        int ZeroCount = 0;

        ArrayList<Integer> aobj = new ArrayList<Integer>();

        for(int Num : iArr)
        {
            if(Num != 0)
            {
                aobj.add(Num);
            }
            else
            {
                ZeroCount++;
            }
        }


        while(ZeroCount != 0)
        {
            aobj.add(0);
            ZeroCount--;
        }

        System.out.println(aobj);
    }
}