package tryagain;

import java.util.Scanner;

public class program13 {
    public static void main(String args[])
    {
           Scanner sc = new Scanner( System.in);
           int n = sc.nextInt();
           int ans = n*(n+1)/2;
           System.out.print(ans);
    }
}
