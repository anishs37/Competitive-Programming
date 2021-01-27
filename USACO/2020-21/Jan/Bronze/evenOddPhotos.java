//Passes all test cases

import java.util.*;
import java.io.*;

class evenOddPhotos
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader f = new BufferedReader(new InputStreamReader(System.in));  
        
      StringTokenizer st_1 = new StringTokenizer(f.readLine());
      int n = Integer.parseInt(st_1.nextToken());
      
      ArrayList<Integer> nums = new ArrayList<Integer>();
      StringTokenizer st_2 = new StringTokenizer(f.readLine());
      
      for(int i = 0; i < n; i++)
      {
         int num = Integer.parseInt(st_2.nextToken());
         nums.add(num);         
      }
      
      int evenNums = 0;
      int oddNums = 0;
      
      for(int i = 0; i < n; i++)
      {
         int numGet = nums.get(i);
         
         if(numGet % 2 == 0)
            evenNums++;
         
         else
            oddNums++;
      }
      
      int permutations = 1;
      
      if(oddNums > evenNums)
      {
         permutations = evenNums * 2;
         int oddEvenDifference = oddNums - evenNums;
         double helper = oddEvenDifference / 3;
         int intHelper = ((int) helper);
         
         if(oddEvenDifference % 3 == 0)
            permutations += (intHelper * 2);
         
         else if(oddEvenDifference % 3 == 1)
            permutations += (intHelper * 2) - 1;
         
         else if(oddEvenDifference % 3 == 2)
            permutations += ((intHelper * 2) - 2) + 3;       
      }
      
      else if(oddNums == evenNums)
         permutations = evenNums * 2;
      
      else if(oddNums < evenNums)
         permutations += oddNums * 2;
         
      System.out.println(permutations);     
   }
}
