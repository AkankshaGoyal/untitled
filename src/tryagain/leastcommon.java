package tryagain;

public class leastcommon {
    public static void main(String args[])
    {
        int a = 0;
        int b = 1;
        int n = 7;
        int sum = 0;
        int c=0;
        System.out.print(a);
        System.out.print(b);
        for(int i=1;i<=n;i++)
        {
            c = a+b;
            System.out.print(c);
            a=b;
            b=c;
        }

    }
}
