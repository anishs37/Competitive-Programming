//Link to Problem: https://codeforces.com/problemset/problem/282/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_282
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int numOp = Integer.parseInt(st_1.nextToken());
      int x = 0;
      
      for(int i = 0; i < numOp; i++)
      {
         StringTokenizer str = new StringTokenizer(read.readLine());
         String op = str.nextToken();
         
         String first_letter = op.charAt(0) + "";
         String last_letter = op.substring(op.length() - 1);
         
         if((first_letter.equals("+")) || (last_letter.equals("+")))
            x++;
         
         else
            x--;
      }
      
      System.out.println(x);
   }
}
