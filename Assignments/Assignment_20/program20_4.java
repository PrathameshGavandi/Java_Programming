
import java.awt.event.ItemEvent;

class Logic
{
    void findLargestDigit(int num)
    {
        int iRem = 0, iGretest = 0;
        while(num > 0)
        {
            iRem = num % 10;

            if(iRem > iGretest)
            {
                iGretest = iRem;
            }

            num = num / 10;
            
        }

        System.out.println("The largest digit is : " + iGretest);

    }

}

class program20_4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83425);
    }
}