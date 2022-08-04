package tryagain;

public class printlist {
         static class Node
         {
             int key;
             Node next;
         };
         static Node newNode(int key)
         {
                  Node temp = new Node();
                  temp.key = key;
                  temp.next = null;
                  return temp;
         }
         static void printlist(Node head)
         {
             while(head!= null)
             {
                 System.out.println(head.key);
                 head = head.next;
             }

         }
         public static void main(String args[])
         {
             printlist ll = new printlist();
             Node head = newNode(30);
             head.next = newNode(40);
             head.next.next = newNode(50);
             head.next.next.next = newNode(8);
             printlist(head);
         }
}
