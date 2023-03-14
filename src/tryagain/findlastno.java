package tryagain;
import java.util.*;
public class findlastno {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int d = sc.nextInt();
        int x = n%7;
        int ans = d-x;
        int finalans;
        if(ans >=0)
        {
            finalans = ans;
        }
        else {
            finalans = ans +7;
        }
        System.out.println(finalans);
        switch (finalans)
        {
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;


        }
    }
}
