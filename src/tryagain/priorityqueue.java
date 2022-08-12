package tryagain;
import java.util.*;

public class priorityqueue {
    public static void main(String args[])
    {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Jai Shankar");
        queue.add("Raj");
        System.out.print(queue.element());
        System.out.print(queue.peek());
        Iterator itr = queue.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next());
        }
    }
}
