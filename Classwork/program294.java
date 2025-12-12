import java.util.*;

class program294
{
    public static void main(String A[])
    {
        int Arr[] = {45,21,90,54,78};

        // this is foreach loop
        for(int no : Arr)
        {
            System.out.println(no); 
        }    

        int Index = Arrays.binarySearch(Arr,90);    //inbuild from collection for search for specific element

        System.out.println("Element fount at :" + Index);
    }
}