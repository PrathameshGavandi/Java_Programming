import java.util.*;

class ReverseArrayList
{
    public static void main(String A[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List : " + list);

        for(int i = list.size() - 1; i >= 0; i--)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}