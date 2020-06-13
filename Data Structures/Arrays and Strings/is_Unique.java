// Implement an algorithm to determine if a string has all unique characters
// Without using additional data structures

import java.util.*;

class is_Unique{
   public static void main(String args[]){
      String str = "kerthna";
      System.out.println("using hash set - "+using_hashset(str)); 
      System.out.println("using bit vector - "+using_bitVector(str)); 
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
   
   // Using Bit Vector
   // Time Complexity - O(n)
   // Space Complexity - some extra space is used to store the intermediate bits
   public static boolean using_bitVector(String s){
      int checker = 0;
      int val = 0;
      
      for(int i =0;i < s.length();i++){
         val = s.charAt(i) - 'a';
         if( (checker & ( 1 << val)) > 0)
            return false;
         
         checker = checker | ( 1 << val);
      }
      
      return true;   
   }
// Other approaches
// 1. Brute Force - for every character in the string, run for the entire string to check if the character exists. This approach takes O(n^2)
//    time complexity.
// 2. Sort the input string, run through the string and check the neighbouring characters. sorting might take some space.

}