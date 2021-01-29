//Link to Problem: https://codeforces.com/problemset/problem/148/A
//Date: 11/26/2020

import java.io.*;
import java.util.*;

public class A_148
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st = new StringTokenizer(read.readLine());
      int k = Integer.parseInt(st.nextToken());
      
      StringTokenizer st1 = new StringTokenizer(read.readLine());
      int l = Integer.parseInt(st1.nextToken());
      
      StringTokenizer st2 = new StringTokenizer(read.readLine());
      int m = Integer.parseInt(st2.nextToken());
      
      StringTokenizer st3 = new StringTokenizer(read.readLine());
      int n = Integer.parseInt(st3.nextToken());
      
      StringTokenizer st4 = new StringTokenizer(read.readLine());
      int d = Integer.parseInt(st4.nextToken());
      
      int count = 0;
      
      for(int i = 1; i <= d; i++)
         if((i % k == 0) || (i % l == 0) || (i % m == 0) || (i % n == 0))
            count++;
      
      System.out.println(count);
   }
}