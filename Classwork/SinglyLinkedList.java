import java.security.PublicKey;
import java.util.*;

class node
{
    public int data;
    public node next;

    public node(int no)
    {
        this.data = no;
        this.next = null;
    }
}
class SinglyLL
{
    public node first;
    public int iCount;

    public SinglyLL()
    {
        System.out.println("Object of SinglyLL gets created");
        this.first = null;
        this.iCount = 0;
    }

    public void InsertFirst(int no)
    {
        node newn = new node(no);

        if(this.first == null )
        {
            this.first = newn;
        }
        else
        {
            newn.next = this.first;
            this.first = newn;
        }

        this.iCount++;
    }

    public void InsertLast(int no)
    {
        node newn = new node(no);
        
        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            node temp = null;

            temp = this.first;

            while (temp.next != null) 
            {
                temp = temp.next;
            }

            temp.next = newn;
        }

        iCount++;
    }

    public void InsertAtPos(int no, int pos)
    {

        if(pos < 1 || pos > iCount + 1)
        {
            System.out.println("Invalid Position");
            return;
        }

        if(pos == 1 )
        {
            InsertFirst(no);
        }
        else if(pos == iCount + 1)
        {
            InsertLast(no);
        }
        else
        {
            node newn = new node(no);
            node temp = this.first;

            for(int iCnt = 1; iCnt < pos - 1; iCnt++)
            {
                temp = temp.next;
            }


            newn.next = temp.next;
            temp.next = newn;
            this.iCount++;

        }

    }

    public void Display()
    {
        node temp = null;

        temp = this.first;

        while(temp != null)
        {
            System.out.print(" | " + temp.data + " | ->");
            temp = temp.next;
        }
    }

    public int Count()
    {
        return this.iCount;
    }
}

class SinglyLinkedList
{
    public static void main(String A[])
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        //
        obj.InsertLast(71);
        obj.InsertLast(91);
        obj.InsertLast(101);

        //
        obj.InsertAtPos(61,4);
        obj.Display();
        
    }
}