import java.util.*;
public class MaxFreq
{
    static final int ASCII_SIZE = 256;
    static String getMax(String str)
    {
        
        int count[] = new int[ASCII_SIZE];
      
        String s = "";
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
      
        int max = -1;  
        char result = ' ';   

        for (int i = 0; i < len; i++) 
        {
            if (max < count[str.charAt(i)]) 
            {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        s=s+result+" and occurence is "+max;
        return s;
    }
     
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Max occurring character is " +
                            getMax(str));
    }
}