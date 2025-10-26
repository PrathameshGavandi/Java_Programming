class Logic
{
    void claculateSum(int n)
    {
        int iCnt = 0;
        int iSum = 0;
        if(n < 0)
        {
            n = -n;
        }

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            iSum = iSum + iCnt;
        }

        System.out.println("Total sum is : " + iSum);
    }

}

class program16_1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.claculateSum(-10);
    }
}
