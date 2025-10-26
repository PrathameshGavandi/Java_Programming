class Logic
{
    void checkPrime(int num)
    {
        int iCnt = 0, iFrequency = 0;
        if(num < 0)
        {
            num = -num;
        }
        
        for(iCnt = 2; iCnt < num; iCnt++)
        {
            if((num % iCnt) == 0)
            {
                iFrequency++;
            }
        }

        if(iFrequency == 0)
        {
            System.out.println("Number is Prime");
        }
        else
        {
            System.out.println("Number is not Prime");
        }
    }


}

class program18_1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.checkPrime(12);
    }
}
