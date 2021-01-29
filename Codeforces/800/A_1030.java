//Link to Problem: https://codeforces.com/problemset/problem/1030/A
//Date: 11/25/2020

import java.io.*;
import java.util.*;
 
public class A_1030
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int n = Integer.parseInt(st_1.nextToken());
      
      StringTokenizer st_2 = new StringTokenizer(read.readLine());
      
      boolean hard = false;
      
      for(int i = 0; i < n; i++)
      {
         int entry = Integer.parseInt(st_2.nextToken());
         
         if(entry == 1)
         {
            hard = true;
            System.out.println("HARD");
            break;
         }
      }
      
      if(hard == false)
         System.out.println("EASY");
   }
}