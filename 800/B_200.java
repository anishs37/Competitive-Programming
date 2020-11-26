//Link to Problem: https://codeforces.com/problemset/problem/200/B
//Date: 11/25/2020

import java.io.*;
import java.util.*;
 
public class B_200
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in)); 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      
      int n = Integer.parseInt(st_1.nextToken());
      double sum = 0;
      
      StringTokenizer st_2 = new StringTokenizer(read.readLine());
      
      for(int i = 0; i < n; i++)
      { 
         double val = Integer.parseInt(st_2.nextToken());
         sum += val;
      }
      
      System.out.println(sum / n);
   }
}