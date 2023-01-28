package tryagain;
import java.util.*;
public class printaverage {

    public static void printavg(int a,int b,int c)
    {
        int sum = a+b+c;
        int av = sum/3;
        System.out.print(av);
    }
    public static void sumofodd(int n)
    {
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum = sum + i;
            }
        }
        System.out.print(sum);
    }
    public static void takestwonumber(int a,int b)
    {
        if(a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }
    public static void checkage(int a,int b)
    {
        if(a >= 18&& b >= 18)
        {
            System.out.print("age of a and b is greater than 18");
        }
        if(a < 18  && b< 18)
        {
            System.out.print("age of both a and b is less than 18");
        }
        if(a < 18)
        {
            System.out.println("a is less than 18");
        }
        else {
            System.out.print("a is greater than 18");
        }
        if(b > 18)
        {
            System.out.print("b is greater than 18");
        }
        else {
            System.out.print("b is less than 18");
        }

    }
    public static void checknumber(int a)
    {
        if(a > 0)
        {
            System.out.println("positive");
        }
        else if(a < 0)
        {
            System.out.print("negative");
        }
        else {
            System.out.print("zero");
        }
    }
    public static void calculategreatest(int a,int b)
    {

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int od = sc.nextInt();
        printavg(a,b,c);
        sumofodd(od);
        takestwonumber(a,b);
        checkage(a,b);
        calculategreatest(a,b);
    }
}
