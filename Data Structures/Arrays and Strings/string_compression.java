// String Compression -- "aabcccccaaa" --> a2b1c5a3

import java.util.*;
class string_compression{
   public static void main(String args[]){
      String s = "aabccccca";
      String s1 = "abcds";
      System.out.println(inplace(s));  
      System.out.println(inplace(s1));
   }
   
   public static String inplace(String s){
      int cnt = 1;
      char ch = s.charAt(0);
      StringBuilder compressed_string = new StringBuilder();
      for(int i =1;i<s.length();i++){
         if(s.charAt(i) == ch)
            cnt++;
         else{
            compressed_string.append(ch);
            compressed_string.append(cnt);
            ch = s.charAt(i);
            cnt = 1;
         }
      }
      compressed_string.append(ch);
      compressed_string.append(cnt);
      System.out.println("Compressed string - "+compressed_string);
      System.out.println("Original String - "+s);
      
      String res = compressed_string.toString();
      
      return (res.length() < s.length() ? res : s);
   }
}