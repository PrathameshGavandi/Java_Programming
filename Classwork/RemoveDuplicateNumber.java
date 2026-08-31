import java.util.*;

class RemoveDuplicateNumber
{
    public static void main(String A[])
    {
        int iArr[] = {1,2,3,4,5,3,5,7,8,3,4,9};

        LinkedHashSet<Integer> sobj = new LinkedHashSet<Integer>(); // Stores only unique values

        for(int Num : iArr)
        {
            sobj.add(Num);
        }

        System.out.println(sobj);
    }
}