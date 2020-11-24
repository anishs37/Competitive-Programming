//Link to Problem: https://codeforces.com/problemset/problem/791/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_791                                                   /*Limac weight triples every year,
                                                                       Bob weight doubles every year */
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int a = Integer.parseInt(st_1.nextToken());                    //Limak weight
      int b = Integer.parseInt(st_1.nextToken());                    //Bob weight
      
      int years = 0;
      
      while(a <= b)
      {
         a *= 3;
         b *= 2;
         years++;
      }
      
      System.out.println(years);
   }
}