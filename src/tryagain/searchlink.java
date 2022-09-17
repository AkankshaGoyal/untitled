package tryagain;

public class searchlink {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data =d;
            next = null;
        }
    }
    public void push(int nd)
    {
        Node newnode = new Node(nd);
        newnode.next = head;
        head = newnode;
    }
    int count(int search_for)
    {
        Node current = head;
        int count = 0;
        while(current!= null) {
            if (current.data == search_for)
                count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String args[])
    {
        searchlink ll = new searchlink();
        ll.push(1);
        ll.push(2);
        ll.push(1);
        ll.push(3);
        ll.push(1);
        System.out.println(ll.count(1));
    }
}
