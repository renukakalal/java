
import java.util.*; 
  
// Driver Class 
public class GFG { 
    // main function 
    public static void main(String[] args) 
    { 
        int n = 123456; 
        // conversion of int to string 
        String temp = "" + n; 
  
        // creating stringbuilder obj 
        StringBuilder sb = new StringBuilder(temp); 
        // using reverse method to 
        // reverse the obj 
        StringBuilder str = sb.reverse(); 
        // printing reverse number 
        System.out.println(str.toString()); 
    } 
}