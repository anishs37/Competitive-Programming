//Link to Problem: https://codeforces.com/problemset/problem/479/A
//Date: 11/25/2020

import java.io.*;
import java.util.*;
 
public class A_479
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int a = Integer.parseInt(st_1.nextToken());
      
      StringTokenizer st_2 = new StringTokenizer(read.readLine());
      int b = Integer.parseInt(st_2.nextToken());
      
      StringTokenizer st_3 = new StringTokenizer(read.readLine());
      int c = Integer.parseInt(st_3.nextToken());  
      
      /*
      a + b + c
      a * b * c
      a * (b + c)
      a + b * c
      (a + b) * c
      a * b + c
      */
      
      int s1 = a + b + c;
      int s2 = a * b * c;
      int s3 = a * (b + c);
      int s4 = a + b * c;
      int s5 = (a + b) * c;
      int s6 = a * b + c;
      
      ArrayList<Integer> vals = new ArrayList<Integer>();
      
      vals.add(s1);
      vals.add(s2);
      vals.add(s3);
      vals.add(s4);
      vals.add(s5);
      vals.add(s6);
      
      int max = s1;
      
      for(int i = 1; i < 6; i++)
         if(vals.get(i) > max)
            max = vals.get(i);
            
      System.out.println(max);
      
   }
}