import java.io.*;
import java.util.*;

class mixmilk
{
  public static void main (String [] args) throws IOException 
  {
      BufferedReader f = new BufferedReader(new FileReader("mixmilk.in"));
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));
            
      StringTokenizer st_1 = new StringTokenizer(f.readLine());
      int c1 = Integer.parseInt(st_1.nextToken());
      int m1 = Integer.parseInt(st_1.nextToken());
      
      StringTokenizer st_2 = new StringTokenizer(f.readLine());
      int c2 = Integer.parseInt(st_2.nextToken());
      int m2 = Integer.parseInt(st_2.nextToken());
      
      StringTokenizer st_3 = new StringTokenizer(f.readLine());
      int c3 = Integer.parseInt(st_3.nextToken());
      int m3 = Integer.parseInt(st_3.nextToken());
      
      if(c2 >= m2 + m1)
      {
         m2 += m1;
         m1 = 0;
      }
      
      else
      {
         if(c2 != m2)
         {
            int m11 = m1;
            for(int i = 0; i < m11; i++)
            {
               if(c2 != m2)
               {
                  m2++;
                  m1--;
               }               
            }
         }
      }
      
      if(c3 >= m3 + m2)
      {
         m3 += m2;
         m2 = 0;
      }
      
      else
      {
         if(c3 != m3)
         {
            int m22 = m2;
            for(int i = 0; i < m22; i++)
            {
               if(c3 != m3)
               {
                  m3++;
                  m2--;
               }               
            }
         }
      }
      
      if(c1 >= m1 + m3)
      {
         m1 += m3;
         m3 = 0;
      }
      
      else
      {
         if(c1 != m1)
         {
            int m33 = m3;
            for(int i = 0; i < m33; i++)
            {
               if(c1 != m1)
               {
                  m1++;
                  m3--;
               }               
            }
         }
      }
      
      if(c2 >= m2 + m1)
      {
         m2 += m1;
         m1 = 0;
      }
      
      else
      {
         if(c2 != m2)
         {
            int m11_1 = m1;
            for(int i = 0; i < m11_1; i++)
            {
               if(c2 != m2)
               {
                  m2++;
                  m1--;
               }               
            }
         }
      }
      
      out.println(m1);
      out.println(m2);
      out.println(m3);
      
      //System.out.println(m1);
      //System.out.println(m2);
      //System.out.println(m3);
      
      out.close();
  }
}