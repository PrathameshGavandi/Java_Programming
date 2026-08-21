// import java.util.*;

// import javax.naming.directory.SearchResult;

// // Perword reverse
// class practice 
// {
//     public static void main(String A[])
//     {
//         Scanner sobj = new Scanner(System.in);

//         System.out.println("Enter String :");
        
//         String str = sobj.nextLine();

//         String Word = "";
//         String Result = "";

//         for(int i = 0; i <= str.length(); i++)
//         {
            
//             if(i == str.length() || str.charAt(i) == ' ' )
//             {
//                 String Reversed = "";

//                 for(int j = Word.length() - 1; j >= 0; j--)
//                 {
//                     Reversed = Reversed + Word.charAt(j);
//                 }

//                 if(Result.length() == 0)
//                 {
//                     Result = Reversed;
//                 }
//                 else
//                 {
//                     Result = Result + " " + Reversed;
//                 }

//                 Word = "";
                
//             }
//             else
//             {
//                 Word = Word + str.charAt(i);
//             }
//         }


//         System.out.println(Result);
//     }
    
// }




/*------------------------------------------------------------------------*/
//Find Height frequency number in an array

// import java.util.*;

// class practice
// {
//     public static void main(String A[])
//     {
//         int iArr[] = {1,2,3,4,5,4,2,3,1,5,6,1,2,2};

//         HashMap<Integer, Integer> hobj = new HashMap<Integer, Integer>();

//         for(int i : iArr)
//         {
//             int old = 0;

//             if(hobj.containsKey(i))
//             {
//                 old = hobj.get(i);
//                 hobj.put(i,old + 1);
//             }
//             else
//             {
//                 hobj.put(i,1);
//             }
//         }

//         int iMax = 0;
//         int Maxint = 0;

//         for(int j : hobj.keySet())
//         {
//             if(hobj.get(j) > iMax)
//             {
//                 iMax = hobj.get(j);
//                 Maxint = j;
//             }
//         }

//         System.out.println("Maximum times integer occured is " + Maxint + " With frequency : " + iMax);
//     }
// }




/*------------------------------------------------------------------------
//Remove Duplicate elements from an array
*/
// import java.util.*;
// import java.util.LinkedHashSet;

// class practice
// {
//     public static void main(String A[])
//     {
//         int iArr[] = {10,20,10,30,50,40,20,30,10,30,60};

//         LinkedHashSet<Integer> lobj = new LinkedHashSet<Integer>();

//         for(int i : iArr)
//         {
//             lobj.add(i);
//         }

//         System.out.println(lobj);
//     }
// }


/*------------------------------------------------------------------------*/
// Find first non repeating character from string

// import java.util.*;

// class practice
// {
//     public static void main(String A[])
//     {
//         Scanner sobj = new Scanner(System.in);

//         System.out.println("Enter string : ");

//         String str = sobj.nextLine();

//         char Crr[] = str.toCharArray();

//         HashMap<Character, Integer> hobj = new HashMap<Character, Integer>();

//         for(char ch : Crr)
//         {
//             int old = 0;

//             if(hobj.containsKey(ch))
//             {
//                 old = hobj.get(ch);
//                 hobj.put(ch, old + 1);
//             }
//             else
//             {
//                 hobj.put(ch, 1);
//             }
//         }

//         char firstnonrepeat = ' ';
//         for(char c : Crr)
//         {
//             if(hobj.get(c) == 1)
//             {
//                 firstnonrepeat = c;
//                 break;
//             }
//         }

//         if(firstnonrepeat == ' ')
//         {
//             System.out.println("There is no first non repeating character ");
//         }
//         else
//         {
//             System.out.println("First non repeating character is : " + firstnonrepeat);
//         }
        
        

//     }
// }

/*------------------------------------------------------------------------*/
// Find Second Largest element in array

import java.util.*;

class practice 
{
    public static void main(String A[])
    {
        int iArr[] = {10,20,30,40,50};
        int Largest = iArr[0];
        int SecondLargest = iArr[1];

        if(iArr[0] > iArr[1])
        {
            Largest = iArr[0];
            SecondLargest = iArr[1];
        }
        else
        {
            Largest = iArr[1];
            SecondLargest = iArr[0];
        }

        for(int no : iArr)
        {
            if(no > Largest)
            {
                SecondLargest = Largest;
                Largest = no;
            }
            else if(no < Largest && no != SecondLargest)
            {
                SecondLargest = no;
                Largest = no;
            }
        }

        System.out.println("Second largest is : " + SecondLargest);
    }
}