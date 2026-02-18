// 4th bit off
// 1111     1111    1111    1111    1111    1111    1111    1111
//  f         f     f       f       d       f       f       f
//oxfffffdfff

import java.util.*;

class program636
{
    public static void main(String A[]) 
    {

        int iNo = 0, iMask = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();
        
        iMask = 0xffffdfff;

        iNo = iNo & iMask;

        System.out.println("Updated number : " + iNo);

    }
}

