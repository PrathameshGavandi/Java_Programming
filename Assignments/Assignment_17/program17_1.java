class Logic
{
    void sumOfDigits(int num)
    {
        int iRem = 0,iSum = 0;
        while(num > 0)
        {
            iRem = num % 10;

            iSum = iSum + iRem;

            num = num / 10;
        }

        System.out.println("Sum of digits is :" + iSum);

    }

}

class program17_1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}
