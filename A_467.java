//Link to Problem: https://codeforces.com/problemset/problem/467/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_467
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int num = Integer.parseInt(st_1.nextToken());
      
      int count = 0;
      
      for(int i = 0; i < num; i++)
      {
         StringTokenizer st_2 = new StringTokenizer(read.readLine());
         int p = Integer.parseInt(st_2.nextToken());
         int q = Integer.parseInt(st_2.nextToken());
         
         if(q - p >= 2)
            count++;
      }
      
      System.out.println(count);
   }
}