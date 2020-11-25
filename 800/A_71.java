//Link to Problem: https://codeforces.com/contest/71/problem/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_71
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int numWords = Integer.parseInt(st_1.nextToken());
      
      ArrayList<String> words = new ArrayList<String>();
      
      for(int i = 0; i < numWords; i++)
      {
         StringTokenizer str = new StringTokenizer(read.readLine());
         String word = str.nextToken();
         
         if(word.length() <= 10)
            System.out.println(word);
         
         else
         {
            String first_letter = word.charAt(0) + "";
            int length_to_print = word.length() - 2;
            String last_letter = word.substring(word.length() - 1);
            
            System.out.println(first_letter + length_to_print + last_letter);
         }
      }
   }
}
