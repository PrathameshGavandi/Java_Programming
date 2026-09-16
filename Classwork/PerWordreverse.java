import java.util.*;
class PerWordreverse
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Sentence");
        String input = sobj.nextLine();

        String words[] = input.split(" ");
        
        for(String w : words)
        {
            String Reversed = "";
            
            for(int i = w.length() - 1; i >= 0; i--)
            {
                Reversed = Reversed + w.charAt(i);
            }

            System.out.print(Reversed + " ");
        }

        
    }
}
