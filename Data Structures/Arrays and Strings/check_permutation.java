// Given 2 strings, check if one is the permutation of another.

import java.util.*;

class check_permutation{
   public static void main(String args[]){
      String s1 = "abd";
      String s2 = "abf";
      System.out.println(using_hashMap(s1,s2));   
   }
   
//    public static boolean using_sorting(String s1, String s2){
//    
//    }
//    public static String sortString(String s){
//    
//    }   
   public static boolean using_hashMap(String s1, String s2){
      if(s1 == "" & s2 == "")
         return true;
         
      if(s1.length() != s2.length())
         return false;
         
      HashMap<Character, Integer> map1 = new HashMap<Character,Integer>();
      HashMap<Character, Integer> map2 = new HashMap<Character,Integer>();  
      char ch;
      
      // create hashamap for string 1
      for(int i = 0;i<s1.length();i++){
         ch = s1.charAt(i);
         if(!map1.containsKey(ch))
            map1.put(ch,1);
         else
            map1.put(ch, map1.get(ch)+1); 
      }
      
      // create hashamap for string 2
      for(int i = 0;i<s2.length();i++){
         ch = s2.charAt(i);
         if(!map2.containsKey(ch))
            map2.put(ch,1);
         else
            map2.put(ch, map2.get(ch)+1); 
      }
      
      if(map1.size() != map2.size())
         return false;
      
      for(int i =0;i<s1.length();i++){
         ch = s1.charAt(i);
         if( map1.get(ch) != map2.get(ch) )
            return false;
      }     
      return true;
   }
}