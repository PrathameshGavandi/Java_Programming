class Demo
{
    public int i;
    public static int j;

    static      //static block
    {
        j=21;
    }

    public Demo()
    {
        System.out.println("Inside default");
        this.i=11;          //first use

    }

    public Demo(int a)
    {
        this();             //second use //default constructor call // It always at first line of constructor
        System.out.println("Inside parametrized");
    }

    public void display()
    {
        System.out.println("Inside display" + this.i);      //third use
    }

}

class ThisDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.display();

    }
}