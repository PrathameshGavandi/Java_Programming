class Logic
{
    void checkPerfect(int num)
    {
        int iCnt = 0, iFact = 0;

        if(num < 0)
        {
            num = -num;
        }

        for(iCnt = 1; iCnt < num; iCnt++)
        {
            if((num % iCnt) == 0)
            {
                iFact = iFact + iCnt;
            }
        }

        if( iFact == num)
        {
            System.out.println(num + " is Perfect number");
        }
        else
        {
            System.out.println(num + " is NOT a Perfect number");
        }
        
    }

}

class program20_3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}