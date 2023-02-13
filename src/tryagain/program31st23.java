package tryagain;

public class program31st23 {
    public static void main(String args[])
    {
           int arr[] = {4,3,2,1};
           int temp;
           int i;
           for(i=0;i<arr.length-1;i++)
           {
               for(int j=i+1;j<arr.length;j++)
               {
                   if(arr[j] < arr[i])
                   {
                          temp = arr[i];
                          arr[i] = arr[j];
                          arr[j] = temp;
                   }
               }
           }
           System.out.print(arr[i] + " ");
    }
}
