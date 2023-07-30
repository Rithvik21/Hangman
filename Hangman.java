//Name:Rithvik Padigala
//Period:4A
import java.util.*;

public class Hangman
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int[] array = {5, 10, 3, 6, 9, 15};
        for (int i = 0; i < array.length / 2; i = i + 2)
        {  
           array[i] = array[array.length - i - 1];
        }
        System.out.println(array[0]);
        
        System.out.println(myst("anan","banana"));
        
        
    }
    
    public static String check(String a, String b)
    {
         if(a.compareTo(b) > 0)
            return "bigger";
         if(a.compareTo(b) < 0)
          return "smaller";
       return "equal";
    }
    public static boolean myst(String a, String b)
    {
         return b.lastIndexOf(a)!=b.indexOf(a);
    }
}
