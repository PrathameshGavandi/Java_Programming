class Logic
{
    void findMin(int a, int b, int c)
    {
        if(a < b && a < c)
        {
            System.out.println("Minimum is :" + a);
        }
        else if (b < a && b < c)
        {
            System.out.println("Minimum is :" + b);
        }
        else
        {
            System.out.println("Minimum is :" + c);
        }
    }

}

class program17_4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.findMin(3, 7, 2);
    }
}