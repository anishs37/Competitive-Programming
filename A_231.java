//Link to Problem: https://codeforces.com/problemset/problem/231/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_231
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int numProbs = Integer.parseInt(st_1.nextToken());
      
      //ArrayList<String> words = new ArrayList<String>();
      
      int count_to_print = 0;
      
      for(int i = 0; i < numProbs; i++)
      {
         //ArrayList<Integer> know = new ArrayList<Integer>();
         int count = 0;
         StringTokenizer str = new StringTokenizer(read.readLine());
         int f1 = Integer.parseInt(str.nextToken());
         int f2 = Integer.parseInt(str.nextToken());
         int f3 = Integer.parseInt(str.nextToken());
         
         if(f1 == 1)
            count++;
         
         if(f2 == 1)
            count++;
         
         if(f3 == 1)
            count++;
            
         if(count >= 2)
            count_to_print++;
      }
      
      System.out.println(count_to_print);
   }
}