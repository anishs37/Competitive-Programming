//Link to Problem: https://codeforces.com/problemset/problem/228/A
//Date: 11/26/2020

import java.io.*;
import java.util.*;

public class A_228
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st = new StringTokenizer(read.readLine());
      int s1 = Integer.parseInt(st.nextToken());
      int s2 = Integer.parseInt(st.nextToken());
      int s3 = Integer.parseInt(st.nextToken());
      int s4 = Integer.parseInt(st.nextToken());
      
      int count = 0;
      
      if(s1 == s2)
         count++;
      
      if(s1 == s3)
         count++;
      
      if(s1 == s4)
         count++;
      
      if(s2 == s3)
         count++;
      
      if(s2 == s4)
         count++;
      
      if(s3 == s4)
         count++;
      
      if((s2 == s3) && (s3 == s4) && (s2 == s4))
         count--;
      
      if((s1 == s2) && (s2 == s3) && (s1 == s3))
         count--;
            
      if(count < 4)
         System.out.println(count);
      
      else
         System.out.println(3);
   }
}