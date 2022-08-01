package tryagain;

import java.util.Scanner;

public class concat {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String s3=str1.concat(str2);
        StringBuffer sbr = new StringBuffer(s3);
        sbr = sbr.reverse();
        //String s = str1 + str2;
        System.out.println(sbr);
        String rev = "";
        char[] try1 = str2.toCharArray();
        for(int i=try1.length-1;i>=0;i--)
        {
            rev = rev+ try1[i];
        }
        System.out.println(rev);
    }
}
