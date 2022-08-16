package tryagain;

public class multiplecatch {
    public static void main(String args[])
    {
        try
        {
            int a[] = new int[5];
            System.out.println(a[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.print("arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print("Array index out of bound");
        }
        catch(Exception e)
        {
            System.out.print("parent exception occurs");
        }
        System.out.print("rest of the code");
    }
}
