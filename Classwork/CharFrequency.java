// Program with HashMap 
// Time Complexicity : O(n)

import java.util.*;

class CharFrequency
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        HashMap<Character, Integer> hobj = new HashMap<Character, Integer>();

        int old = 0;

        for(char ch : Arr)
        {
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

        int iMax = 0;
        char cMax = '\0';

        for(char ch : hobj.keySet())
        {
            if(hobj.get(ch) > iMax)
            {
                iMax = hobj.get(ch);
                cMax = ch;
            }
        }

        System.out.println("The heightst frequency character is : " + cMax + " , with frequency : " + iMax);
    }
}


// Program with nested loops
// Time Complexicity : O(n²)

// import java.util.*;

// class CharFrequency
// {
//     public static void main(String A[])
//     {
//         Scanner sobj = new Scanner(System.in);

//         System.out.println("Enter String : ");
//         String str = sobj.nextLine();

//         char cArr[] = str.toCharArray();
        
//         int i = 0, j = 0, iCount = 0, MaxCount = 0;
//         char MaxChar = '\0';

//         for(i = 0; i < cArr.length; i++)
//         {
//             iCount = 0;

//             for(j = 0; j < cArr.length; j++)
//             {
//                 if(cArr[i] == cArr[j])
//                 {
//                     iCount++;
//                 }
//             }

//             if(iCount > MaxCount)
//             {
//                 MaxCount = iCount;
//                 MaxChar = cArr[i];
//             }
//         }

//         System.out.println("Character with heighest frequency is : " + MaxChar + " , With frequency : " + MaxCount);
//     }
// }
