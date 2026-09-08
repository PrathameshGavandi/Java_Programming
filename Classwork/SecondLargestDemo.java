import java.util.*;
import java.util.Scanner;

class SecondLargestDemo
{
    public static void main(String A[])
    {
        int iArr[] = {10,20,34,35,82,46};

        int iCnt = 0;

        int firstLargest,secondLargest;

        if(iArr[0] > iArr[1])
        {
            firstLargest = iArr[0];
            secondLargest = iArr[1];
        }
        else
        {
            firstLargest = iArr[1];
            secondLargest = iArr[0];
        }

        for(iCnt = 0; iCnt <= iArr.length - 1; iCnt++)
        {
            if(iArr[iCnt] > firstLargest)
            {
                secondLargest = firstLargest;
                firstLargest = iArr[iCnt];
            }
            else if(iArr[iCnt] < firstLargest && iArr[iCnt] != secondLargest)
            {
                secondLargest = iArr[iCnt];
            }
        }

        System.out.println(secondLargest);
    }
}