import java.util.*;
public class ToggleCase
{
  String toggle(String s1)
  {
      int k=0,s;
      String result = "";
      for(int i=0;i<=s1.length()-1;i++)
     {
         s=(int)s1.charAt(i);
         if(s!=' ')
         {
             if(s>=65 && s<=90)
             k=s+32;
             if(s>=97 && s<=122)
             k=s-32;
             
             result=result+(char)k;
            }
            else
            result=result+ " ";
        }
      return result;
  }
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      ToggleCase obj = new ToggleCase();
      String result = obj.toggle(s);
      System.out.println(result);
   }
}