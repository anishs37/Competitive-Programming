//Passes all test cases

import java.util.*;
import java.io.*;

class cowphabet
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader f = new BufferedReader(new InputStreamReader(System.in));  
        
      StringTokenizer st_1 = new StringTokenizer(f.readLine());
      String cowphabet = st_1.nextToken();
      
      StringTokenizer st_2 = new StringTokenizer(f.readLine());
      String checker = st_2.nextToken();
      
      cowphabet = cowphabet.toLowerCase();
      checker = checker.toLowerCase();
      
      int repeat = 1;
      int firstOccurence = cowphabet.indexOf(checker.charAt(0));
      int checkerSize = checker.length();
      
      for(int i = 1; i < checkerSize; i++)
      {
         int otherOccurences = cowphabet.indexOf(checker.charAt(i));
         
         if(firstOccurence >= otherOccurences)
            repeat++; 
         
         firstOccurence = otherOccurences;      
      }
      
      System.out.println(repeat);  
   }
}
