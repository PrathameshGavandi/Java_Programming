class Logic
{
    void countEvenOddRange(int n)
    {
        int iCnt = 0, iEfrequency = 0, iOfrequency = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iEfrequency++;
            }
            else
            {
                iOfrequency++;
            }
        }

        System.out.println("Even numbers present in 1 To Number count is : " +iEfrequency);
        System.out.println("Odd numbers present in 1 To Number count is : " +iOfrequency);
    }

}

class program21_2
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}