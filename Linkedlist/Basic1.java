public class Basic1
{

    public static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    public static void displayr(Node head)
    {
        if(head==null)
        return;
        System.out.print(head.data+" ");
        displayr(head.next);

    }
    public static int length(Node head)
    {
        int count = 0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;

     }
   public static void func(Node head)
    {
        if(head==null)
        return;
        func(head.next);             // reverse order print
        System.out.print(head.data);

    }
    public static class Node
    {
        int data; // value
        Node next; // address of next Node
        Node(int data)
        {
            this.data=data;
        }
    }
    public static void main(String[] args)
    {

     Node a =new Node(5);
     //System.out.println(a.next);
     Node b =new Node(3);
     Node c =new Node(9);
     Node d =new Node(8);
    // Node e =new Node(10);

     a.next=b;
    //  System.out.println(b.data);
    //  System.out.println(a.next.data);
    a.next=b;
    b.next=c;
    c.next=d;
    //d.next=e;    
    // Node temp=a;
    // // for(int i=1;i<=5;i++)
    // // {
    // //     System.out.println(temp.data+" ");
    // //     temp=temp.next;
    // // }
    // while(temp!=null)//printing the list
    // {
    //     System.out.println(temp.data+" ");
    //     temp=temp.next;
    // }
    display(a);
    System.out.println();
    displayr(a);
    System.out.println();
     func(a);
     int count=0;
     int len=length(a);
     System.out.println("length is "+len);
}
}
