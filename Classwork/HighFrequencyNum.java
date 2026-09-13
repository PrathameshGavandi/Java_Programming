import java.util.*;

class HighFrequencyNum 
{
    public static void main(String A[]) 
    {
        int Arr[] = { 1, 2, 3, 4, 3, 4, 5, 4 };
        int i = 0, j = 0, iCount = 0, MaxCount = 0, MaxNumber = 0;

        for (i = 0; i < Arr.length; i++) 
        {
            iCount = 0;
            for (j = 0; j < Arr.length; j++) 
            {
                if (Arr[i] == Arr[j]) 
                {
                    iCount++;
                }
            }

            if (iCount > MaxCount) 
            {
                MaxCount = iCount;
                MaxNumber = Arr[i];
            }
        }

        System.out.println("Maximum occured number is : " + MaxNumber + " , with frequency : " + MaxCount);
    }
}
