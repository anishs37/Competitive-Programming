//Link to Problem: https://codeforces.com/problemset/problem/546/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_546                                                   //banana cost increases k, 2k, 3k...
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int k = Integer.parseInt(st_1.nextToken());                    //cost of first banana
      int n = Integer.parseInt(st_1.nextToken());                    //initial # of $ soldier has
      int w = Integer.parseInt(st_1.nextToken());                    //# bananas soldier wants
      
      int cost = 0;
      
      for(int i = 1; i <= w; i++)
         cost += (i * k);
         
      int diff = n - cost;
      
      if(diff >= 0)
         System.out.println(0);
      
      else
         System.out.println(Math.abs(n - cost));
   }
}