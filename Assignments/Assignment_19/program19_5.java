class Logic
{
    void calculatePower(int base, int exp)
    {
        if(base < 0)
        {
            base = -base;
        }
        if(exp < 0)
        {
            exp = -exp;
        }
        int iCnt = 0, iResult = 1;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iResult = iResult * base;
        }
        
        System.out.println(base + " raised to the power " + exp + " is " + iResult);
    
    }

}

class program19_5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.calculatePower(2,5);
    }
}