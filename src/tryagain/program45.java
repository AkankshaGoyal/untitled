package tryagain;

public class program45 {
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int j=1;j<=i;j++)
            {
                if(j!=1)
                {
                    System.out.print(j);
                }
            }
            System.out.println();

        }
    }
}
