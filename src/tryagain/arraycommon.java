package tryagain;

import java.util.HashSet;
import java.util.*;
import java.io.*;
public class arraycommon {
    public static void main(String args[])
    {
        int[] arr1 ={16,45,67,90,57};
        int[] arr2 = {16,45};
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i: arr1)
        {
             set1.add(i);
        }
        for(int i: arr2)
        {
            set2.add(i);
        }
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
