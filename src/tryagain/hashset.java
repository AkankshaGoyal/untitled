package tryagain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class hashset {
    public static boolean areDistinct(Integer arr[])
    {
        Set <Integer> s = new HashSet<Integer>(Arrays.asList(arr));
        return (s.size()== arr.length);

    }
    public static void main(String args[])
    {
        Integer[] arr  = {10,20,50,80,90,100};
        if(areDistinct(arr))
            System.out.print("All element are distinct");
        else
            System.out.print("Not all element are ditinct");
    }
}
