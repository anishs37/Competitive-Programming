//Passes all test cases

import java.util.*;
import java.io.*;

class stalls
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader f = new BufferedReader(new InputStreamReader(System.in));  
        
      StringTokenizer st_1 = new StringTokenizer(f.readLine());
      int n = Integer.parseInt(st_1.nextToken());
      
      ArrayList<Integer> cowNums = new ArrayList<Integer>();
      int[] cowArray = new int[n];
      StringTokenizer st_2 = new StringTokenizer(f.readLine());
      
      for(int i = 0; i < n; i++)
      {
         int num = Integer.parseInt(st_2.nextToken());
         cowNums.add(num);
         cowArray[i] = num;      
      }
      
      ArrayList<Integer> stallNums = new ArrayList<Integer>();
      int[] stallArray = new int[n];
      StringTokenizer st_3 = new StringTokenizer(f.readLine());
      
      for(int i = 0; i < n; i++)
      {
         int num = Integer.parseInt(st_3.nextToken());
         stallNums.add(num);
         stallArray[i] = num;      
      }
      
      int[] ansArray = new int[n];
      long permutations = 0;
      Collections.sort(cowNums);
      
      for(int i = 0; i < n; i++)
      {
         int iPerms = 0;
         
         for(int k = 0; k < n; k++)
         {
            int cowGet = cowNums.get(i);
            int stallGet = stallNums.get(k);
            
            if(cowGet <= stallGet)
               ansArray[i]++;
         }     
      }
      
      permutations = ansArray[n - 1];
      
      for(int i = 1; i <= (n - 2); i++)
      {
         int ansArr = ansArray[i];
         int correctionFactor = n - i - 1;
         
         permutations *= (ansArray[i] - correctionFactor);
      }
        
      System.out.println(permutations);
   }
}
