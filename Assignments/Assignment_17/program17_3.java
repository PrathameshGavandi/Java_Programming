class Logic
{
    void findMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println("Maximum is :" + a);
        }
        else
        {
            System.out.println("Maximum is :" + b);
        }
    }

}

class program17_3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.findMax(20, 15);
    }
}