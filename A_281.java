//Link to Problem: https://codeforces.com/problemset/problem/281/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_281
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      String word = st_1.nextToken();
      
      String first_letter = word.charAt(0) + "";
      first_letter = first_letter.toUpperCase();
      
      String newWord = first_letter + word.substring(1);
      
      System.out.println(newWord);
   }
}