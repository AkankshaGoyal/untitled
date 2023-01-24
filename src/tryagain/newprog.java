package tryagain;
import java.util.*;
public class newprog {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j=j+n-1)
            {
                for(int k=1;k<=n;k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
