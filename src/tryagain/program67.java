package tryagain;
import java.util.*;
public class program67 {
    public static void findsum(int a,int b)
    {
        System.out.println(a+b);
        System.out.println(a*b);
    }
    public static void findfact(int a)
    {
        int fact = 1;
        for(int i=1;i<=a;i++)
        {
            fact = fact*i;
        }
        System.out.print(fact);
    }
    public static void main(String args[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        findsum(a,b);
        findfact(a);
    }
}
