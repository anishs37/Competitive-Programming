//Link to Problem: https://codeforces.com/problemset/problem/112/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_112
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      String strA = st_1.nextToken();
      
      StringTokenizer st_2 = new StringTokenizer(read.readLine());
      String strB = st_2.nextToken();
      
      strA = strA.toLowerCase();
      strB = strB.toLowerCase();
      
      if(strA.compareTo(strB) < 0)
         System.out.println(-1);
      
      else if(strA.compareTo(strB) > 0)
         System.out.println(1);
      
      else
         System.out.println(0);
   }
}