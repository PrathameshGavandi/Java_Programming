class Logic
{
    void productofDigit(int num)
    {
        int iRem = 0, iMult = 1;
        while(num > 0)
        {
            iRem = num % 10;

            iMult = iMult * iRem;

            num = num / 10;
        }

        
        System.out.println("Product of digits is: " + iMult);
    }

}

class program21_1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.productofDigit(234);
    }
}
