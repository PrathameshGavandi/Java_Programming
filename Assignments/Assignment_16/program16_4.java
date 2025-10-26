class Logic
{
    void reverseNumber(int num)
    {
        int iRem = 0, iRev = 0;

        if(num < 0)
        {
            num = -num;
        }

        while(num > 0)
        {
            iRem = num % 10;

            iRev = (iRev * 10) + iRem;

            num = num / 10;
        }

        System.out.println("Reversed Number :" + iRev);

    }

}

class program16_4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}