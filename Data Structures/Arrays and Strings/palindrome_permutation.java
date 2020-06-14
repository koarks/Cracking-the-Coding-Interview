// Check if the given string is permutation of a palindrome

import java.util.*;

class palindrome_permutation{
   public static void main(String args[]){
      String s = "Tact Coa";
      s =s.toLowerCase();
      System.out.println(using_hashMap(s));
      System.out.println(using_bitVector(s));
   }  
   
   // n = size of the string
   // time complexity --> O(n)
   // space complexity - worst case --> O(n)
   public static boolean using_hashMap(String s){
      HashMap<Character,Integer> map = new HashMap<Character,Integer>();
      char ch;
      
      for(int i =0;i<s.length();i++){
         ch = s.charAt(i);
         if(!map.containsKey(ch))
            map.put(ch,1);
         else
            map.remove(ch);
      }
      if(map.size() == 0 | map.size() == 1)
         return false;
      
      return true;   
   }
   
   // idea is to generate the vector with maximum 25 bits(0 - 25), 000011 --> "ab"
   // Complexity - O(n)
   public static boolean using_bitVector(String s){
      int bitVector =  0;
      int val = 0;
      int a_start = 0;
      int z_end = 'z' - 'a';
      System.out.println(a_start+" "+z_end);
      for(char ch : s.toCharArray()){
         
         val = ch - 'a';
         System.out.println(ch+" "+val);
         if( val < a_start | val > z_end)
            continue;                           
         if( (bitVector & (1 << val)) == 0) // if the same character is repeating, it will be 1 else 0
            bitVector = bitVector | ( 1 << val);
         else
            bitVector = bitVector & ~( 1 << val);
      }
      System.out.println("bitVector"+bitVector);
      if (bitVector == 0 | ((bitVector & (bitVector -1 )) == 0))
         return true;
      
      return false;
   }
}