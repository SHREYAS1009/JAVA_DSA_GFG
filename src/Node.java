public class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Test
{
    public static void main(String args[])
    {
        Node head=null;
        head=insertBegin(head,30);
        head=insertBegin(head,20);
        head=insertBegin(head,100);
        displayNode(head);
    }

    static Node insertBegin(Node head,int x)
    {
        Node temp=new Node(x);
        temp.next=head;
        head=temp; //optional may or not be used
        return temp;
    }

    static void displayNode(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;

        }
    }
}
