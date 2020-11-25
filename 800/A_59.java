//Link to Problem: https://codeforces.com/problemset/problem/59/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_59
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      String word = st_1.nextToken();
      
      int lowerL = 0;
      int upperL = 0;
      
      for(int i = 0; i < word.length(); i++)
      {
         if(Character.isUpperCase(word.charAt(i)))
            upperL++;
         
         else
            lowerL++;
      }
      
      if(upperL > lowerL)
         System.out.println(word.toUpperCase());
      
      else
         System.out.println(word.toLowerCase());
   }
}
