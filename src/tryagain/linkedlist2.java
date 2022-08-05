package tryagain;

public class linkedlist2 {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void push(int new_data)
    {
        Node newnode = new Node(new_data);
        newnode.next = head;
        head = newnode;
    }

    void deleteNode(int position)
    {
        if(head == null)
            return;
        Node temp = head;
        if(position == 0)
        {
            head  = temp.next;
            return;
        }
        for(int i=0;temp!=null && i<position-1;i++)
        {
            temp = temp.next;
        }
        if(temp == null || temp.next == null)
              return;
        Node next = temp.next.next;
        temp.next = next;
    }
   public void printlist()
   {
       Node tnode = head;
       while(tnode !=null)
       {
           System.out.print
                   (tnode.data);
           tnode = tnode.next;
       }
   }
   public static void main(String args[])
   {
       linkedlist2 ll = new linkedlist2();
       ll.push(7);
       ll.push(1);
       ll.push(3);
       ll.push(2);
       ll.push(8);
       //ll.printlist();
       ll.deleteNode(3);
       ll.printlist();
   }
}
