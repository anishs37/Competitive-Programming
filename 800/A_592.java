//Link to Problem: https://codeforces.com/problemset/problem/592/A
//Date: 11/26/2020

import java.io.*;
import java.util.*;

public class A_592
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st = new StringTokenizer(read.readLine());
      int n = Integer.parseInt(st.nextToken());
      
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      String str = st_1.nextToken();
      
      str = str.toLowerCase();
      
      String letters = "abcdefghijklmnopqrstuvwxyz";
      
      ArrayList<Integer> pangram = new ArrayList<Integer>();
      
      for(int i = 0; i < str.length(); i++)
         for(int j = 0; j < letters.length(); j++)
            if(str.charAt(i) == letters.charAt(j))
               pangram.add(j);
      
      boolean pangrams = true;;
               
      for(int i = 0; i < letters.length(); i++)
      {
         if(!pangram.contains(i))
         {
            pangrams = false;
            break;
         }
      }
      
      if(pangrams)
         System.out.println("YES");
      
      else
         System.out.println("NO");
   }
}