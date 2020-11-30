//Link to Problem: https://codeforces.com/problemset/problem/723/A
//Date: 11/29/2020

import java.io.*;
import java.util.*;
 
public class A_723
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int a = Integer.parseInt(st_1.nextToken());
      int b = Integer.parseInt(st_1.nextToken());
      int c = Integer.parseInt(st_1.nextToken());
      
      ArrayList<Integer> coords = new ArrayList<Integer>();
      
      coords.add(a);
      coords.add(b);
      coords.add(c);
      
      Collections.sort(coords);
      
      int median = coords.get(1);
      
      int a_length = Math.abs(a - median);
      int b_length = Math.abs(b - median);
      int c_length = Math.abs(c - median);
      
      System.out.println(a_length + b_length + c_length);
   }
}