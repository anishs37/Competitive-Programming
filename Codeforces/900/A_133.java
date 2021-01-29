//Link to Problem: https://codeforces.com/problemset/problem/133/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_133
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      String str = st_1.nextToken();
      
      int j = 0;
      for(int i = 0; i < str.length(); i++)
         if((str.charAt(i) == 'H') || (str.charAt(i) == 'Q') || (str.charAt(i) == '9'))
            j = 1;
            
      if(j == 1)
         System.out.println("YES");
      
      else
         System.out.println("NO");
   }
}