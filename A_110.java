//Link to Problem: https://codeforces.com/problemset/problem/110/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_110
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      String num = st_1.nextToken();
      long num_int = Long.parseLong(num);
      
      int count = 0;
      
      for(int i = 0; i < num.length(); i++)
      {
         if((num.charAt(i) == '4') || (num.charAt(i) == '7'))
            count++;
      }
      
      if((count == 4) || (count == 7) || (count == 47) || (count == 744))
         System.out.println("YES");
      
      else
         System.out.println("NO");
   }
}