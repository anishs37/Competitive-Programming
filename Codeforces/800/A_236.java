//Link to Problem: https://codeforces.com/problemset/problem/236/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_236
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      String str = st_1.nextToken();
      
      long distinct = str.chars().distinct().count();
      
      if((distinct % 2) == 0)
         System.out.println("CHAT WITH HER!");
      
      else
         System.out.println("IGNORE HIM!");
   }
}
