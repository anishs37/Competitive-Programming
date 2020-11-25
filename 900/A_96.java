//Link to Problem: https://codeforces.com/problemset/problem/96/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_96
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      String str = st_1.nextToken();
      
      int count = 1;
      
      for(int i = 0; i < str.length() - 1; i++)
      {
         if(str.charAt(i) == str.charAt(i + 1))
         {
            count++;
            
            if(count >= 7)
               break;
         }
         
         else
            count = 1;
      }
      
      if(count < 7)
         System.out.println("NO");
      
      else
         System.out.println("YES");
   }
}
