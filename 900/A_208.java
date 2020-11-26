//Link to Problem: https://codeforces.com/problemset/problem/208/A
//Date: 11/26/2020

import java.io.*;
import java.util.*;

public class A_208
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st = new StringTokenizer(read.readLine());
      String str = st.nextToken();
      
      str = str.toUpperCase();
      str = str.replace("WUB", " ");
      str = str.trim();
      
      for(int i = 0; i < str.length() - 1; i++)
         if((str.charAt(i) == ' ') && (str.charAt(i + 1) == ' '))
            str = str.substring(0, i + 1) + str.substring(i + 2);
            
      System.out.println(str);
   }
}