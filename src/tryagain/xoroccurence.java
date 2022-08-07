package tryagain;

public class xoroccurence {

    int occur(int ar[],int n)
    {
        int i;
        int res = 0;
        for( i=0;i<n;i++)
        {
            res = res ^ ar[i];
        }
        return res;
    }


    public static void main(String args[])
    {
        xoroccurence abc = new xoroccurence();
        int ar[] = new int[]{2,3,7,3,2};
        int n = ar.length;
        System.out.print(abc.occur(ar,n));
    }
}
