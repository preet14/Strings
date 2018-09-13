import java.util.*;
class Check
{
  boolean checkPalindrome(String s)
  {
    String rev = "";
    boolean b = true;
    for(int i=(s.length()-1);i>=0;i--)
    {
      rev = rev + s.charAt(i);
    }
     if(s.equals(rev))
     {
       return b; 
     }
     else
     {
       b=false;
       return b;
     }
  }
}
public class Palindrome
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    Check obj = new Check();
    boolean b = obj.checkPalindrome(str);
    if(b==true)
    {
       System.out.println("Palindrome : "+b);
    }
    else
    {
      System.out.println("Palindrome : "+b);
    }
  }
}