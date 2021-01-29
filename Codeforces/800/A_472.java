//Link to Problem: https://codeforces.com/problemset/problem/472/A
//Date: 11/28/2020

import java.io.*;
import java.util.*;
 
public class A_472
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int n = Integer.parseInt(st_1.nextToken());
      
      for(int i = 4; i < n - 4; i++)
      {
         if((!isPrime(i)) && (!isPrime(n - i)))
         {
            System.out.println(i + " " + (n - i));
            System.exit(0);
         }
      }
   }
   
   public static boolean isPrime(int n)
   {
      for(int i = 2; i <= Math.sqrt(n); i++)
         if(n % i == 0)
            return false;
         
      return true;
   }
}