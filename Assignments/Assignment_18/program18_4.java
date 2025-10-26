class Logic
{
    void sumEvenOddDigits(int num)
    {
        int iCnt = 0,iRem = 0, iEsum = 0, iOsum = 0;
        while(num > 0)
        {
            iRem = num % 10;

            if((iRem % 2) == 0)
            {
                iEsum = iEsum + iRem;
            }
            else
            {
                iOsum = iOsum + iRem;
            }

            num = num / 10;
            
        }
        
        System.out.println("Sum of Even Digits :" + iEsum);
        System.out.println("Sum of Odd Digits :" + iOsum);

    }

}

class program18_4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}