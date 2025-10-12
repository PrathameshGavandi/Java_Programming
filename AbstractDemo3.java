abstract class Base
{
    public int i,j;
    public int Addition(int a, int b)
    {
        return a+b;
    }
    abstract public int Substraction(int a, int b);

  
}
class Derived extends Base      
{
    public int Substraction(int a, int b)
    {
        return a-b;
    }
    public int Multiplication(int a, int b)
    {
        return a*b;
    }

}

class AbstractDemo3
{
    public static void main(String A[])
    {
        Base bp = new Derived();  
        int iRet=0;

        iRet=bp.Addition(11,10);
        System.out.println(Addition);

        iRet=bp.Substraction(10,11);
        ystem.out.println(Substraction);

        //iRet=bp.Multiplication(10,11);        //ERRROR

      
        

    }
}