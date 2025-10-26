class Logic
{
    void sumEvenNumbers(int n)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        System.out.println("Sum of all Even Numbers is : " + iSum);
        
    }

}

class program20_1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}
