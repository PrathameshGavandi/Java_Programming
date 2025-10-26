class Logic
{
    void countDigits(int num)
    {
        int iRem = 0, iCount = 0;
        while(num > 0)
        {
            iRem = num % 10;

            iCount++;

            num = num / 10;
        }

        System.out.println("Digits in number is :" + iCount);

    }

}

class program16_5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.countDigits(78655);
    }
}