import java.util.*;

class FindSecondLargest
{
    public static void main(String A[])
    {
        int iArr[] = {12,56,53,34,67,45,48};

        int FirstLargest, SecondLargest;
        int iCnt = 0;

        if(iArr[0] > iArr[1])
        {
            FirstLargest = iArr[0];
            SecondLargest = iArr[1];
        }
        else
        {
            FirstLargest = iArr[1];
            SecondLargest = iArr[0];
        }


        for(iCnt = 2; iCnt <= iArr.length - 1; iCnt++)
        {
            if(iArr[iCnt] > FirstLargest)
            {
                SecondLargest = FirstLargest;
                FirstLargest = iArr[iCnt];
            }
            else if(iArr[iCnt] < FirstLargest && iArr[iCnt] > SecondLargest)
            {
                SecondLargest = iArr[iCnt];
            }
        }

        System.out.println(SecondLargest);
    }
}
