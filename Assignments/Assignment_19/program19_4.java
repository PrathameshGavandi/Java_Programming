class Logic
{
    void printDigits(int num)
    {
        int iCnt = 0,iRem = 0;
        while(num > 0)
        {
            iRem = num % 10;

            System.out.println(iRem);

            num = num / 10;
            
        }

    }

}

class program19_4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}