import java.util.*;

class PerWordReverseWithoutBuiltinFun
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        String Result = "";
        String Word = "";

        for(int i = 0; i <= str.length(); i++)
        {
            if(i == str.length() || str.charAt(i) == ' ')
            {
                String Reversed = "";

                for(int j = Word.length() - 1; j >= 0; j--)
                {
                    Reversed = Reversed + Word.charAt(j);
                }

                if(Result.length() == 0)
                {
                    Result = Reversed;
                }
                else
                {
                    Result = Result + " " + Reversed;
                }

                Word = "";
            }
            else
            {
                Word = Word + str.charAt(i);
            }
        }

        System.out.println(Result);
    }
}