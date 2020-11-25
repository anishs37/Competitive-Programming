//Link to Problem: https://codeforces.com/problemset/problem/160/A
//Date: 11/25/2020

import java.io.*;
import java.util.*;
 
public class A_160
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int num = Integer.parseInt(st_1.nextToken());
      
      StringTokenizer st_2 = new StringTokenizer(read.readLine());
      ArrayList<Integer> vals = new ArrayList<Integer>();
      
      int totalSum = 0;
      
      for(int i = 0; i < num; i++)
      {
         int val = Integer.parseInt(st_2.nextToken());
         totalSum += val;
         vals.add(val);
      }
      
      int count = 0;
      int sum = 0;
      
      Collections.sort(vals, Collections.reverseOrder());
      
      int i = 0;
      
      do
      {
         int value = vals.get(i);
         sum += value;
         count++;
         i++;
      }
      
      while(sum <= (totalSum / 2));
      
      System.out.println(count);
   }
}