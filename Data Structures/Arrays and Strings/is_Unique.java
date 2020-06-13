// Implement an algorithm to determine if a string has all unique characters
// Without using additional data structures
import java.util.*;

class is_Unique{
   public static void main(String args[]){
      String str = "kKerthna";
      System.out.println("using hash set - "+using_hashset(str));  
   }
   // using a data structure
   public static boolean using_hashset(String s){
      HashSet<Character> set = new HashSet<Character>();
      char ch;
      
      for(int i =0;i <s.length();i++){
         ch = s.charAt(i);
         if(!set.contains(ch))
            set.add(ch);
         else
            return false;         
      }   
      
      return true;
   }
}