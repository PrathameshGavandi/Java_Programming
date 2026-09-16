import java.security.Key;
import java.util.*;

class FindDuplicateChar
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String input = sobj.nextLine();

        char Arr[] = input.toCharArray();

        HashMap <Character, Integer> hobj = new HashMap<Character, Integer>();

        for(char ch : Arr)
        {
            int old = 0;

            if(ch == ' ')   // space ignore krte
            {
                continue;
            }

            if(hobj.containsKey(ch))
            {
                old = hobj.get(ch);
                hobj.put(ch, old + 1);
            }
            else
            {
                hobj.put(ch, 1);
            }
        }



        for(char c : hobj.keySet())
        {
            if(hobj.get(c) > 1)
            {
                System.out.println("Key :" + c + " Value : " + hobj.get(c));
            }
        }
    }
}