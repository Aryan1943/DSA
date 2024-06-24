

public class Implementation
 {
public static class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
    public static class Linkedlist{
       Node head=null;
       Node tail=null;
       void insertAtEnd(int val)
       {
        Node temp=new Node(val);
       if(head==null)
       {
        head=temp;
       }
       else{
        tail.next=temp;
       }
       tail=temp;
       }
       void display()
       {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
         temp=temp.next;      
          }
       }
       int size()
       {
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
           count++;
         temp=temp.next;      
          }
          return count;
       }
       void insertAtBeg(int val)
       {
        Node temp=new Node(val);
        if(head==null) // empty list condition
        {
            insertAtEnd(val);
        }
        else
        {
            temp.next=head;
            head=temp;
        }

       }
       void insertAt(int idx,int val)
       {
        Node t=new Node(val);
        Node temp=head;
        if(idx==size())
        {
            insertAtEnd(val);
            return;
        }
        else if(idx==0)
        {
            insertAtBeg(val);
        }
        else if(idx<0 || idx>size())
        {
            System.out.println("wrong index");
        }

        for(int i=0;i<=idx-1;i++)
        {
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;


       }
       int getAt(int idx)
       {
        Node temp=head;
        for(int i=1;i<=idx;i++)
        {
            temp=temp.next;
        }
      return temp.data;

       }
       void deleteAt(int idx)
       {
        Node temp=head;
        if(idx==0)
        {
            head=head.next;
            return;
        }
        for(int i=1;i<=idx;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        tail=temp;
       }
    }
    public static void main(String[] args) 
    {
        Linkedlist ll=new Linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtBeg(10);
        ll.insertAtEnd(8);
        ll.insertAt(3,100);
        // System.out.println(ll.size());
        ll.insertAt(0,20);
        ll.display();
        ll.deleteAt(2);
      System.out.println(ll.getAt(2));
        


    }
    
}
