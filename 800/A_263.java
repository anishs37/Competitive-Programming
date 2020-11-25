//Link to Problem: https://codeforces.com/problemset/problem/263/A
//Date: 11/25/2020

import java.io.*;
import java.util.*;
 
public class A_263
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      
      int moves = 0;
      int row = 0;
      int col = 0;
      for(int i = 0; i < 5; i++)
      {
         StringTokenizer str = new StringTokenizer(read.readLine());
         int num1 = Integer.parseInt(str.nextToken());
         int num2 = Integer.parseInt(str.nextToken());
         int num3 = Integer.parseInt(str.nextToken());
         int num4 = Integer.parseInt(str.nextToken());
         int num5 = Integer.parseInt(str.nextToken());
         
         if(col == 0)
            row++;
         
         if(num1 == 1)
            col = 1;
         
         else if(num2 == 1)
            col = 2;
         
         else if(num3 == 1)
            col = 3;
         
         else if(num4 == 1)
            col = 4;
         
         else if(num5 == 1)
            col = 5;            
      }
      
      int row_diff = Math.abs(row - 3);
      int col_diff = Math.abs(col - 3);
      
      System.out.println(row_diff + col_diff);
   }
}