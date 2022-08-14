package tryagain;

import java.util.TreeSet;
import java.util.*;

public class treeset {
    public static void main(String args[])
    {
        Set <String> ts1 = new TreeSet<>();
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");
        ts1.add("C");
        System.out.print(ts1);
    }
}
