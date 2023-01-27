package tryagain;
import java.util.*;
public class projectpattern {
    public static void main(String args[])
    {
       int i = 1;
       int n =  5;
       for(i=1;i<=n;i++)
       {
           for(int j = n-i;j>=1;j--)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print(i);
               System.out.print(" ");
           }
           System.out.println();
       }
    }
}
