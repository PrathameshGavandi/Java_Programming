// Class Demo extends Object
class Demo implements Cloneable      // Without writing Clonable we cant write clone
{
    public int i,j;

    public Demo(int a, int b)
    {
        this.i = a;
        this.j = b;
    }

    public Object clone() throws CloneNotSupportedException    //Object is a return type here, It can return any type of object like (void*)
    {
        return super.clone();
    }
}

class CloneDemo
{
    public static void main( String A[])
    {
        try
        {
            Demo dobj1 = new Demo(11,21);
            Demo dobj2 = (Demo)dobj1.clone();

            System.out.println(dobj2.i);
            System.out.println(dobj2.j);
        }
        catch (CloneNotSupportedException cobj)
        {

        }
    }  
}