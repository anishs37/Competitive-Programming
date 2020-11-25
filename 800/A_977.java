//Link to Problem: https://codeforces.com/problemset/problem/977/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_977
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int n = Integer.parseInt(st_1.nextToken());                    //starting #
      int k = Integer.parseInt(st_1.nextToken());                    //# times to subtract
      
      for(int i = 0; i < k; i++)
      {
         if((n % 10) != 0)
            n -= 1;
         
         else
            n /= 10;
      }
      
      System.out.println(n);
   }
}
