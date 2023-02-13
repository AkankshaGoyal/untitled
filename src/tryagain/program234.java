package tryagain;
import java.util.*;
public class program234 {
    public static void main(String args[])
    {
        Integer[] arr = {13,7,6,45,21,9,2,100};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }
}
