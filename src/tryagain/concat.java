package tryagain;

import java.util.Scanner;

public class concat {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String s3=str1.concat(str2);
        //String s = str1 + str2;
        System.out.print(s3);
    }
}
