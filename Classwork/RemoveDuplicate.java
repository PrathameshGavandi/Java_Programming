import java.util.*;
import java.util.HashMap;

class RemoveDuplicate
{
    public static void main(String A[])
    {
        String str = "Hello Prathamesh";
        
        char cArr[] = str.toCharArray();

        HashMap<Character, Integer> hobj = new HashMap<Character,Integer>();

        for(char ch : cArr)
        {
            int old = 0;
            if(hobj.containsKey(ch))
            {
                old = hobj.get(ch);
                hobj.put(ch,old + 1);
            }
            else
            {
                hobj.put(ch,1);
            }
        }

        LinkedHashSet<Character> sobj = new LinkedHashSet<Character>();

        for(char ch : cArr)
        {
            if(ch != ' ')
            {
                sobj.add(ch);
            }

        }

        System.out.println(sobj);
    }
}