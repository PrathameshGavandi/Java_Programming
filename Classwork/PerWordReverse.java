import java.util.*;
//import java.util.Scanner;

// class PerWordReverse
// {
//     public static void main(String A[])
//     {
//         Scanner sobj = new Scanner(System.in);
//         System.out.println("Enter String : ");
//         String input = sobj.nextLine();

//        // Input: "Welcome to Xperate"  
//           //Output: "emocleW ot etarepX" 

//         String strArray[] = input.split(" ");

//         String Reversed = "";

//         for(String s : strArray)
//         {
//             String Word = "";

//             for(int iCnt = s.length() - 1; iCnt >= 0 ; iCnt--)
//             {
//                 Word = Word + s.charAt(iCnt);
//             }

//             Reversed = Reversed + " " + Word;
//         }

//         System.out.println(Reversed);

        
//     }
//}

class PerWordReverse
{
    public static void main(String A[])
    {
        String str = "Let's solve challenges";
        // op - segnellahc evlos s'teL

        String strArr[] = str.split(" ");

        String Reversed = "";

        for(int iCnt = strArr.length - 1; iCnt >= 0; iCnt--)
        {
            //System.out.println(strArr[iCnt]);

            String Word = "";

            for(int i = strArr[iCnt].length() - 1; i >= 0; i--)
            {
                Word = Word + strArr[iCnt].charAt(i);
            }

            Reversed = Reversed + Word + " ";
        }

        System.out.println(Reversed);

        
    }
}