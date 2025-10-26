class Logic
{
    void sumOfDigits(int num)
    {
        int iTemp = num;
        int iRem = 0, iCount = 0, iRev = 0;
        while(num > 0)
        {
            iRem = num % 10;

            iRev = (iRev * 10) + iRem;

            num = num / 10;
        }

        if(iTemp == iRev)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }
    }

}

class program17_2
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1221);
    }
}