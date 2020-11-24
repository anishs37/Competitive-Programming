//Link to Problem: https://codeforces.com/problemset/problem/41/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_41
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      String s = st_1.nextToken();                                   //Berlandish word (normal)
      
      StringTokenizer st_2 = new StringTokenizer(read.readLine());
      String st = st_2.nextToken();                                  //Birlandish word (reverse)
      
      String tester = "";
      
      for(int i = s.length() - 1; i >= 0 ; i--)
         tester += s.charAt(i) + "";
       
      if(tester.equals(st))
         System.out.println("YES");
      
      else
         System.out.println("NO");
   }
}