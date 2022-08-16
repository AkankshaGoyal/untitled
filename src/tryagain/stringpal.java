package tryagain;

import java.util.Scanner;
import java.util.*;
public class stringpal {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s==null)
             System.out.print("no string");
        int len = s.length();
        for(int i=0;i<len/2;i++)
        {
            if(s.charAt(i)!=s.charAt(len-i-1))
                  System.out.print("not a palindrome");
        }
        System.out.print("palindrome");
    }
}
