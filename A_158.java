//Link to Problem: https://codeforces.com/problemset/problem/158/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_158
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int n = Integer.parseInt(st_1.nextToken());
      int k = Integer.parseInt(st_1.nextToken());
      
      ArrayList<Integer> scores = new ArrayList<Integer>();
      StringTokenizer str = new StringTokenizer(read.readLine());
      
      for(int i = 0; i < n; i++)
      {  
         int score = Integer.parseInt(str.nextToken());
         scores.add(score);
      }
      
      int k_score = scores.get(k - 1);
      int count = 0;
      
      for(int i = 0; i < n; i++)
      {
         int n_score = scores.get(i);
         
         if(n_score > 0)
            if(n_score >= k_score)
               count++;
      }
      
      System.out.println(count);
   }
}