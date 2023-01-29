package tryagain;
import java.util.*;
public class matrixprog {
    public static void main(String args[])
    {
        int r = 3;
        int col = 3;
        int [][] mat = new int[r][col];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(mat[i][j]==60)
                {
                    System.out.print(i+" ");
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
}
