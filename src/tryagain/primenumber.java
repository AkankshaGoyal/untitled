package tryagain;

public class primenumber {

    public static int recfun(int n)
    {
        if(n==6)
        {
            return 0;
        }
        System.out.println(n);
        return recfun(n+1);
    }
    public static void main(String args[])
    {
        recfun(1);

    }
}
