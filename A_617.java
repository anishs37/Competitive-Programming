//Link to Problem: https://codeforces.com/problemset/problem/617/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_617
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int x = Integer.parseInt(st_1.nextToken());                    //position of friend's house
      
      if(x <= 5)
         System.out.println(1);
      
      else if((x % 5) == 0)
         System.out.println(x / 5);
         
      else
         System.out.println((x / 5) + 1);
   }
}