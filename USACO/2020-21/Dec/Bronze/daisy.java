//Passes all test cases

import java.util.*;
import java.io.*;

class daisy
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

      StringTokenizer st = new StringTokenizer(read.readLine());  
      int n = Integer.parseInt(st.nextToken());
      
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      ArrayList<Integer> nums = new ArrayList<Integer>();
      
      for(int i = 0; i < n; i++)
      {
         int flow = Integer.parseInt(st_1.nextToken());      
         nums.add(flow);
      }
      
      int count = n;
      
      for(int lower = 0; lower < n - 1; lower++)
      {
         for(int upper = lower + 1; upper < n; upper++)
         {
            double sum = 0;
            double average = 0;
            double counter = (upper - lower) + 1;
            
            for(int i = lower; i <= upper; i++)
               sum += nums.get(i);
            
            average = sum / counter;
            
            int alrCount = 0;
            
            for(int k = lower; k <= upper; k++)
            {
               if((nums.get(k) == average) && (alrCount == 0))
               {
                  count++;
                  alrCount++;
               }
            }
         }
      }
      
      System.out.println(count);
   }
}
