//Link to Problem: https://codeforces.com/problemset/problem/758/A
//Date: 11/30/2020

import java.io.*;
import java.util.*;
 
public class A_758
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int n = Integer.parseInt(st_1.nextToken());
      
      ArrayList<Integer> vals = new ArrayList<Integer>();
      
      StringTokenizer st_2 = new StringTokenizer(read.readLine());
      
      for(int i = 0; i < n; i++)
      {
         int val = Integer.parseInt(st_2.nextToken());
         vals.add(val);
      }
      
      Collections.sort(vals);
      
      int highest_val = vals.get(n - 1);
      int sum = 0;
      
      for(int i = 0; i < n - 1; i++)
         sum += highest_val - vals.get(i);
      
      System.out.println(sum);
   }
}