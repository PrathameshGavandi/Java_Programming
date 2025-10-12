class Prime
{
    public static void main(String Arr[])
    {
        int input = 11;
        int count =0;

        for(int i=1; i<=input;i++)
        {
            if(input%i==0)
            {
                count++;
            }
           
        }
        if(count>2)
        {
            System.out.println("Number is not prime");
        }
        else
        {
            System.out.println("Number is prime");
        }
    }
}