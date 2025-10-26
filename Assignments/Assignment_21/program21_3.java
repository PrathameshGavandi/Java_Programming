class Logic
{
    void displayFactors(int num)
    {
        int iCnt = 0;

        if(num < 0)
        {
            num = -num;
        }

        for(iCnt = 1; iCnt <= num ; iCnt++) 
        {
            if((num % iCnt) == 0 )
            {
                System.out.println(iCnt);
            }
        }
    }

}

class program21_3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}