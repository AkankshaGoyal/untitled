package tryagain;

public class isvowel {

   static boolean isVowel(char ch)
   {
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U');
   }

   static int countvowels(String str)
   {
       int count = 0;
       for(int i=0;i<str.length();i++)
       {
           if(isVowel(str.charAt(i)))
                 ++count;

       }
       return count;
   }
  public static void main(String args[])
  {
      String str = "abcdef";
      System.out.print(countvowels(str));
  }
}
