//Link to Problem: https://codeforces.com/problemset/problem/337/A
//Date: 11/25/2020

import java.io.*;
import java.util.*;
 
public class A_337
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int n = Integer.parseInt(st_1.nextToken());
      int m = Integer.parseInt(st_1.nextToken());
      
      ArrayList<Integer> jigsaw = new ArrayList<Integer>();
      
      StringTokenizer st_2 = new StringTokenizer(read.readLine());
      
      for(int i = 0; i < m; i++)
      {
         int size = Integer.parseInt(st_2.nextToken());
         jigsaw.add(size);
      }
      
      Collections.sort(jigsaw);           //4 6
                                          //10 12 10 7 5 22  
                                          //5 7 10 10 12 22  
      
      //System.out.println(jigsaw);
      
      int min_diff = 99999999;
      
      for(int i = 0; i <= m - n; i++)
      {
         int val = jigsaw.get(i);
         int val_n = jigsaw.get(i + (n - 1));
         
         if(val_n - val < min_diff)
            min_diff = val_n - val; 
      }
      
      if(min_diff == 99999999)
         System.out.println(0);
      
      else
         System.out.println(min_diff);
   }
}