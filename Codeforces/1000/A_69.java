//Link to Problem: https://codeforces.com/problemset/problem/69/A
//Date: 11/25/2020

import java.io.*;
import java.util.*;
 
public class A_69
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int num = Integer.parseInt(st_1.nextToken());
      
      int col1 = 0;
      int col2 = 0;
      int col3 = 0;
      
      for(int i = 0; i < num; i++)
      {
         StringTokenizer st_2 = new StringTokenizer(read.readLine());
         int n1 = Integer.parseInt(st_2.nextToken());
         int n2 = Integer.parseInt(st_2.nextToken());
         int n3 = Integer.parseInt(st_2.nextToken());
         
         col1 += n1;
         col2 += n2;
         col3 += n3;
      }
      
      if((col1 == 0) && (col2 == 0) && (col3 == 0))
         System.out.println("YES");
      
      else
         System.out.println("NO");    
   }
}