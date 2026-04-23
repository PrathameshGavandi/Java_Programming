import java.util.*;
class program803
{
    public static long Fibonacci(int N)
    {   
        if(N <= 1)
        {
            return N;
        }

        return Fibonacci(N - 1) + Fibonacci(N - 2);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int size = 0;

        System.out.println("Enter how many elemts you want :");
        size = sobj.nextInt();

        int i = 0;

        for(i = 0; i <= size; i++)
        {
            System.out.print(Fibonacci(i) + " ");
        }

        System.out.println();
        sobj.close();
    }
}