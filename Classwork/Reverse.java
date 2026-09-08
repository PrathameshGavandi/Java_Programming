import java.util.*;
import java.util.Scanner;

class demo
{
    public int[] Reverse(int Arr[],int iSize)
    {
        int iCnt = 0;
        int iCount = 0;
        int Brr[] = null;

        Brr = new int[iSize];

        for(iCnt = Arr.length - 1; iCnt >= 0; iCnt--)
        {
            Brr[iCount]  = Arr[iCnt];
            iCount++;
        }
        return Brr;
    }
}

class Reverse
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        int Arr[];
        int Brr[];
        int iSize = 0;
        int iCnt = 0;
        
        System.out.println("Enter How many elements you want :");
        iSize = sc.nextInt();

        Arr = new int[iSize];
        System.out.println("Enter the elements :");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sc.nextInt();
        }

        demo dobj = new demo();
        Brr = dobj.Reverse(Arr,iSize);

        System.out.println("Reversed elements of existing array in new array Brr is :");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println("Element reversed one : "+Brr[iCnt]);
        }
    }
}