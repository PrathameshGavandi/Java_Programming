import java.util.*;

class program855 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        // string च्या सुरुवातीचे आणि शेवटचे extra spaces काढतो.
        // Step 1
        str = str.trim();

        // हे multiple spaces एका space मध्ये convert करते.
        // Step 2
        str = str.replaceAll("\\s+", " ");

        // string ला words मध्ये divide करतो आणि array मध्ये store करतो.
        // Step 3
        String Arr[] = str.split(" ");

        for (int i = 0; i < Arr.length; i++) 
        {
            System.out.println(Arr[i]);
        }

    }
}

// \\s+ हा Regular Expression (Regex) आहे जो spaces ओळखण्यासाठी वापरला जातो.

// चला सोप्या भाषेत समजून घेऊ.

// 1️⃣ \s म्हणजे काय?

// \s म्हणजे whitespace character.

// Whitespace मध्ये हे येतात:

// Space " "

// Tab \t

// New line \n

// उदा.

// Hello Java
// Hello\tJava
// Hello\nJava

// हे सगळे \s मध्ये येतात.

// 2️⃣ + म्हणजे काय?

// + म्हणजे one or more times.

// म्हणजे:

// 1 space

// 2 space

// 10 space

// सगळे match होतात.

// 3️⃣ \\s+ का लिहितो?

// Java मध्ये \ हा escape character आहे.

// म्हणून regex मध्ये \s लिहायचे असेल तर Java मध्ये \\s लिहावे लागते.

// म्हणून final expression:

// \\s+