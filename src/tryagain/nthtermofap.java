package tryagain;

import java.util.Scanner;

public class nthtermofap {
    public static void nthterm(int a,int n,int d)
    {
        int ans = a +(n-1)*d;
        System.out.println(ans);
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        nthterm(a,n,d);
    }
}
