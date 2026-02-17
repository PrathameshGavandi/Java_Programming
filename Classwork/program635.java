// 4th bit off
// 1111     1111    1111    1111    1111    1111    1111    1111
//  f         f     f       f       f       f       f       7
//oxffffffff7

import java.util.*;

class program635
{
    public static void main(String A[]) 
    {

        int iNo = 0, iMask = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();
        
        iMask = 0xfffffff7;

        iNo = iNo & iMask;

        System.out.println("Updated number : " + iNo);

    }
}

