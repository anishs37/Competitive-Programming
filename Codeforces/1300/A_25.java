//Link to Problem: https://codeforces.com/problemset/problem/25/A
//Date: 11/25/2020

import java.io.*;
import java.util.*;
 
public class A_25
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int n = Integer.parseInt(st_1.nextToken());
      
      ArrayList<Integer> even = new ArrayList<Integer>();
      ArrayList<Integer> odd = new ArrayList<Integer>();
      
      StringTokenizer str = new StringTokenizer(read.readLine());

      for(int i = 0; i < n; i++)
      {  
         int val = Integer.parseInt(str.nextToken());
         
         if(val % 2 == 0)
            even.add(i);
         
         if(val % 2 != 0)
            odd.add(i);
      }
      
      int index = 0;
      
      if(even.size() == 1)
      {
         index = even.get(0);
         System.out.println(index + 1);
      }
      
      else
      {
         index = odd.get(0);
         System.out.println(index + 1);
      }     
   }
}
