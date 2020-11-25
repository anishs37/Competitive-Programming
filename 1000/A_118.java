//Link to Problem: https://codeforces.com/problemset/problem/118/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_118
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      String str = st_1.nextToken();
      
      str = str.toLowerCase();
      
      str = str.replace("a", "");
      str = str.replace("o", "");
      str = str.replace("y", "");
      str = str.replace("e", "");
      str = str.replace("u", "");
      str = str.replace("i", "");
      
      StringBuffer strPrint = new StringBuffer(str);
      int count = 0;
      
      for(int i = 0; i < str.length(); i++)
      {          
         strPrint.insert(i + count, ".");
         count++;
      }
      
      System.out.println(strPrint);
   }
}
