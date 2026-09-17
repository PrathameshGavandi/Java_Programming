import java.util.*;

class SpaceRemove
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String input = sobj.nextLine();

        input = input.replace(" ","");

        System.out.println(input);

    }
}

//using loop
// String str = "hello world";
// String result = "";

// for(int i = 0; i < str.length(); i++)
// {
//     if(str.charAt(i) != ' ')
//     {
//         result = result + str.charAt(i);
//     }
// }

// System.out.println(result);