class Logic
{
    void checkDivisible(int num)
    {
        if((num % 5 ) == 0 && (num % 11 ) == 0 )
        {
            System.out.println(num + " is Divisible by 5 & 11");
        }
        else
        {
            System.out.println(num + " is NOT Divisible by 5 & 11");
        }
    }
}

class program19_3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.checkDivisible(110);
    }
}
