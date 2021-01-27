//Passes all test cases

import java.util.*;
import java.io.*;

class abc
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      
      int a = 0;
      int b = 0;
      int c = 0;
      
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      
      int int1 = Integer.parseInt(st_1.nextToken());
      int int2 = Integer.parseInt(st_1.nextToken());
      int int3 = Integer.parseInt(st_1.nextToken());
      int int4 = Integer.parseInt(st_1.nextToken());
      int int5 = Integer.parseInt(st_1.nextToken());
      int int6 = Integer.parseInt(st_1.nextToken());
      int int7 = Integer.parseInt(st_1.nextToken());
      
      ArrayList<Integer> nums = new ArrayList<Integer>();
      
      nums.add(int1);
      nums.add(int2);
      nums.add(int3);
      nums.add(int4);
      nums.add(int5);
      nums.add(int6);
      nums.add(int7);
      
      Collections.sort(nums);
      
      int totalSum = nums.get(6);

      int lowest = nums.get(0);
      int lowest2 = nums.get(1);
      int lowest3 = nums.get(2);
      
      if((lowest == lowest2) && (lowest == lowest3) && (lowest2 == lowest3))
         System.out.print(lowest + " " + lowest + " " + lowest);
      
      else
      {
         for(int i = 0; i < 7; i++)
         {
            for(int k = 0; k < 7; k++)
            {
               for(int j = 0; j < 7; j++)
               {
                  if(nums.get(i) + nums.get(k) + nums.get(j) == totalSum)
                  {
                     System.out.println(nums.get(i) + " " + nums.get(k) + " " + nums.get(j));
                     System.exit(0);
                  }
               }
            }
         }
      }
   }
}
