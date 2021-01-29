//Link to Problem: https://codeforces.com/problemset/problem/469/A
//Date: 11/26/2020

import java.io.*;
import java.util.*;

public class A_469
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int n = Integer.parseInt(st_1.nextToken());
      
      StringTokenizer st_2 = new StringTokenizer(read.readLine());
      int p = Integer.parseInt(st_2.nextToken());
      
      ArrayList<Integer> levels = new ArrayList<Integer>();
      
      for(int i = 0; i < p; i++)
      {
         int plevel = Integer.parseInt(st_2.nextToken());
         levels.add(plevel);
      }
      
      StringTokenizer st_3 = new StringTokenizer(read.readLine());
      int y = Integer.parseInt(st_3.nextToken());
      
      for(int i = 0; i < y; i++)
      {
         int ylevel = Integer.parseInt(st_3.nextToken());
         levels.add(ylevel);
      }
      
      Collections.sort(levels);
      
      boolean allLevels = true;
      
      for(int i = 1; i <= n; i++)
         if(!levels.contains(i))
            allLevels = false;
      
      if(allLevels)
         System.out.println("I become the guy.");
      
      else
         System.out.println("Oh, my keyboard!");
   }
}