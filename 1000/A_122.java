//Link to Problem: https://codeforces.com/problemset/problem/122/A
//Date: 11/25/2020

import java.io.*;
import java.util.*;
 
public class A_122
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      String num = st_1.nextToken();
      long num_int = Long.parseLong(num);
      
      if((num_int % 4 == 0) || (num_int % 7 == 0) || (num_int % 47 == 0) || (num_int % 744 == 0))
         System.out.println("YES");
      
      else
         System.out.println("NO");
   }
}