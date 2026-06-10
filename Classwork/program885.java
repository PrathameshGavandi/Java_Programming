// import java.util.*;

// class Student
// {
//     public String name;
//     public int marks;

//     public Student(String a, int b)
//     {
//         this.name = a;
//         this.marks = b;
//     }

//     public void Display()
//     {
//         System.out.println(name + " : "+marks);
//     }
// }

// class program885
// {
//     public static void main(String A[])
//     {
//         Scanner sobj = new Scanner(System.in);

//         ArrayList <Integer> aobj = new ArrayList<Integer>();

//         Student s1 = new Student("sagar", 90);
//         Student s2 = new Student("rahul", 80);
//         Student s3 = new Student("pooja", 92);
//         Student s4 = new Student("amit", 72);

//         System.out.println(s1);
//         System.out.println(s2);

//         s1.Display();
//         s2.Display();
//     }
// }




import java.util.*;

class Student
{
    public String Name;
    public int Marks;

    public Student(String A, int B)
    {
        this.Name = A;
        this.Marks = B;
    }
    public void Display()
    {
        System.out.println(Name + " : "+Marks);
    }
}

class program885
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        ArrayList <Integer> aobj = new ArrayList<Integer>();

        Student s1 = new Student("Sagar", 90);
        Student s2 = new Student("Rahul", 80);
        Student s3 = new Student("Pooja", 92);
        Student s4 = new Student("Amit", 72);

        System.out.println(s1);
        System.out.println(s2);

        s1.Display();
        s2.Display();
        
    }
}