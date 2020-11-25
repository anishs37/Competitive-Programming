//Link to Problem: https://codeforces.com/problemset/problem/705/A
//Date: 11/25/2020

import java.io.*;
import java.util.*;
 
public class A_705
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int n = Integer.parseInt(st_1.nextToken());
      
      if(n == 1)
         System.out.println("I hate it");
      
      else if(n == 2)
         System.out.println("I hate that I love it");
      
      else
      {
         String str = "";
         
         for(int i = 1; i < n; i++)
         {
            if(i % 2 == 1)
               str += "I hate that ";
            
            else
               str += "I love that ";
         }
         
         if(n % 2 == 1)
            str += "I hate it";
         
         else
            str += "I love it";
            
         System.out.println(str);
      }
   }
}