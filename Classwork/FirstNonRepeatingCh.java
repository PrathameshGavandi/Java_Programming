import java.util.*;

class FirstNonRepeatingCh
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String input = sobj.nextLine();

        char Arr[] = input.toCharArray();

        HashMap <Character,Integer> hobj = new HashMap<Character, Integer>();

        for(char ch : Arr)
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

        char FirstNonRepeatch = '\0';
        for(char ch : Arr)
        {
            if(hobj.get(ch) == 1)
            {
                FirstNonRepeatch = ch;
                break;
            }
        }

        if(FirstNonRepeatch != '\0')
        {
            System.out.println("First non repeating character is : " + FirstNonRepeatch);
        }
        else
        {
            System.out.println("No unique character");
        }
    }
}