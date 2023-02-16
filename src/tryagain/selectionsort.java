package tryagain;
import java.io.*;



public class selectionsort {

    void sort(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int min_idx = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_idx])
                {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    void printArray(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        selectionsort ob = new selectionsort();
        int arr[] = {64, 25, 12, 22, 11};
        ob.sort(arr);
        System.out.print("sorted array");
        ob.printArray(arr);
    }
}
