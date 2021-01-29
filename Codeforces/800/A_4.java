//Link to Problem: https://codeforces.com/problemset/problem/4/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_4
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int weight = Integer.parseInt(st_1.nextToken());
      
      if(((weight % 2) == 1) || (weight == 2))
         System.out.println("NO");
      
      else
         System.out.println("YES");
   }
}
