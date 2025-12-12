import java.util.*;

class program297
{
    public static void main(String A[])
    {
        Vector <String> vobj = new Vector <String> ();

        vobj.add("c");
        vobj.add("c++");
        vobj.add("java");
        vobj.add("python");
        vobj.add("C#");
        vobj.add("java");

        System.out.println(vobj);

        vobj.add(2,"lsp");

        System.out.println(vobj);

        System.out.println(vobj.capacity());

        System.out.println(vobj.contains("lsp"));
        System.out.println(vobj.contains("unix"));

        vobj.remove(6);

        System.out.println(vobj);

        Iterator iobj = vobj.iterator();    //vector refrence to the Iterator for doing iterations

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        vobj.clear();
    }
}