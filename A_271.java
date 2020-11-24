//Link to Problem: https://codeforces.com/problemset/problem/271/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_271
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      String year = st_1.nextToken();
      int year_int = Integer.parseInt(year);
      String years = Integer.toString(year_int + 1);
      
      while(years.chars().distinct().count() != years.length())
      {
         year_int++;
         years = Integer.toString(year_int);
      }
      
      System.out.println(years);
   }
}