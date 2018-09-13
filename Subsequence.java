import java.util.Scanner;
 
class Subsequence
{
   void print(String s)
   {
     String sub;
     int length,i,c;
     length = s.length();   
      for (c = 0; c < length; c++)
      {
         for(i = 1; i <= length - c; i++)
         {
            sub = s.substring(c, c+i);
            System.out.println(sub);
         }
      }
   }
   public static void main(String args[])
   {
      String s;
      Scanner in = new Scanner(System.in);
      s  = in.nextLine();
      Subsequence obj = new Subsequence();
      obj.print(s);
   }
}