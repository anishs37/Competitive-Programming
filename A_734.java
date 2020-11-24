//Link to Problem: https://codeforces.com/problemset/problem/734/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_734
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int length = Integer.parseInt(st_1.nextToken());
      
      StringTokenizer st_2 = new StringTokenizer(read.readLine());
      String str = st_2.nextToken();
      
      int aWin = 0;
      int dWin = 0;
      
      for(int i = 0; i < length; i++)
      {
         if(str.charAt(i) == 'A')
            aWin++;
         
         else
            dWin++;
      }
       
      if(aWin > dWin)
         System.out.println("Anton");
      
      else if(aWin == dWin)
         System.out.println("Friendship");
      
      else
         System.out.println("Danik");
   }
}