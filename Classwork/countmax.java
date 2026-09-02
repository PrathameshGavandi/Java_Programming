// Count max present element in array
public static void main(String A[])
{
    int iArr[] = {1,2,3,2,4,5,3,3,3};

    int Maxcount = 1;
    int Maxcountdigit = iArr[0];
    
    for(int i = 0; i < iArr.length; i++)
    {
        int iCount = 1;
        for(int j = 0; j < iArr.length - 1; j++ )
        {
            if(iArr[i] == iArr[j])
            {
                iCount++;
            }
        }

        if(iCount > Maxcount)
        {
            Maxcount = iCount;
            Maxcountdigit = iArr[i];
        }
    }

    System.out.println("Max present digit is :" + Maxcountdigit);
    System.out.println("With frequency : " + Maxcount);
}