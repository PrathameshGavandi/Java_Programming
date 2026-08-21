import java.util.*;

class RemoveDuplicateNumberAndChar
{
    // public static void main(String A[])
    // {
    //     int Arr[] = {1,2,3,4,2,1,5,3,6};

    //     LinkedHashSet <Integer> sobj = new LinkedHashSet<Integer>();// Does not allow duplicates and maintain order like linkedlist

    //     for(int num : Arr)
    //     {
    //         sobj.add(num);
    //     }

    //     System.out.println(sobj);

    // }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        char Crr[] = str.toCharArray();

        LinkedHashSet <Character> lsobj = new LinkedHashSet<Character>();    // Does not allow duplicates

        for(char ch : Crr)
        {
            lsobj.add(ch);
        }

        System.out.println(lsobj);

    }

}