class Logic
{
    void findSmallestDigit(int num)
    {
        int iCnt = 0,iRem = 0, iSmallest = num % 10;
        while(num > 0)
        {
            
            iRem = num % 10;

            if(iRem < iSmallest)
            {
                iSmallest = iRem;
            }

            num = num / 10;
            
        }

        System.out.println("The smallest digit is : " + iSmallest);

    }

}

class program20_5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45827);
    }
}