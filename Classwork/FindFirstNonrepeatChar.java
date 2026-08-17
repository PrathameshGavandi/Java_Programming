import java.util.*;

class FindFirstNonrepeatChar
{
    public static void main(String A[])
    {
        String str = "Programming";

        char cArr[] = str.toCharArray();

        // for(char ch : cArr )
        // {
        //     int Count = 0;

        //     for(int i = 0; i <= str.length() - 1; i++)
        //     {

        //         if(ch == str.charAt(i))
        //         {
        //             Count++;
        //         }
        //     }

        //     if(Count == 1)
        //     {
        //         System.out.println("First Non repeating character is : " + ch);
        //         break;
        //     }
        // }


        HashMap<Character, Integer> hobj = new HashMap<Character, Integer>();

        for(char ch : cArr)
        {
            int old = 0;

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

        
        
        for(char ch : cArr)
        {
            if(hobj.get(ch) == 1)
            {
                System.out.println("First Non repeating character is : " + ch);
                break;
            }
        }
    }
}