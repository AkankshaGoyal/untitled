package tryagain;

public class programtr {
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.print(sb);
        System.out.print(sb.charAt(0));
        sb.setCharAt(0,'P');
        System.out.print(sb);
        sb.insert(2,'n');
        System.out.println(sb);

    }
}
