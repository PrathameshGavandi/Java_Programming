import java.util.*;
import java.util.Scanner;

class demo 
{
    public int SecondMax(int arr[], int Size) 
    {
        int iCnt = 0;
        int firstLargest;
        int secondLargest;

        if (arr[0] > arr[1]) 
        {
            firstLargest = arr[0];
            secondLargest = arr[1];
        } 
        else 
        {
            firstLargest = arr[1];
            secondLargest = arr[0];
        }

        for (iCnt = 0; iCnt < Size; iCnt++) 
        {
            if (arr[iCnt] > firstLargest) 
            {
                secondLargest = firstLargest;
                firstLargest = arr[iCnt];
            } 
            else if (arr[iCnt] < firstLargest && arr[iCnt] > secondLargest) 
            {
                secondLargest = arr[iCnt];
            }
        }

        return secondLargest;
    }
}

class SecondLargest 
{
    public static void main(String A[]) {

        Scanner sc = new Scanner(System.in);

        int Arr[];
        int iSize = 0;
        int iCnt = 0;
        int iRet = 0;

        System.out.println("Enter How many elements you want :");
        iSize = sc.nextInt();

        Arr = new int[iSize];

        System.out.println("Enter the elements :");
        for (iCnt = 0; iCnt < iSize; iCnt++) {
            Arr[iCnt] = sc.nextInt();
        }

        demo dobj = new demo();
        iRet = dobj.SecondMax(Arr, iSize);

        System.out.println("Second Largest element is :" + iRet);

    }
}