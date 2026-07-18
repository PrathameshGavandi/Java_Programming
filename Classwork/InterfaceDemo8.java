interface A
{
    int no=11;
    void fun();
    default void gun()  //imp   //only available in 8+ versions of java
    {
        System.out.println("Inside gun");
    }

}

class Demo implements A
{
    public void fun()
    {
        System.out.println("Inside fun");       
    }
}

class InterfaceDemo8
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
    }
}