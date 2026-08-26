import java.util.*;

class MergeTwoArrays
{
    public static void main(String A[])
    {
        int Arr1[] = {1,2,3,4,5};
        int Arr2[] = {6,7,8,9,10};

        ArrayList<Integer> aobj = new ArrayList<Integer>();

        for(int Num : Arr1)
        {
            aobj.add(Num);
        }

        for(int Num : Arr2)
        {
            aobj.add(Num);
        }

        System.out.println(aobj);
    }
}