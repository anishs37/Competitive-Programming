//Link to Problem: https://codeforces.com/problemset/problem/785/A
//Date: 11/26/2020

import java.io.*;
import java.util.*;

public class A_785
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int n = Integer.parseInt(st_1.nextToken());
      
      int faces = 0;
      for(int i = 0; i < n; i++)
      {
         StringTokenizer st_2 = new StringTokenizer(read.readLine());
         String shape = st_2.nextToken();
         
         if(shape.equals("Tetrahedron"))
            faces += 4;
         
         else if(shape.equals("Cube"))
            faces += 6;
         
         else if(shape.equals("Octahedron"))
            faces += 8;
         
         else if(shape.equals("Dodecahedron"))
            faces += 12;
         
         else if(shape.equals("Icosahedron"))
            faces += 20;  
      }  
             
      System.out.println(faces);
   }
}