//Passes 6/13 test cases

import java.util.*;
import java.io.*;

//priority is to paint lighter colored segments first

class paintSegment
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader f = new BufferedReader(new InputStreamReader(System.in));  
        
      StringTokenizer st_1 = new StringTokenizer(f.readLine());
      int n = Integer.parseInt(st_1.nextToken());
      int q = Integer.parseInt(st_1.nextToken());
      
      StringTokenizer st_2 = new StringTokenizer(f.readLine());
      String str = st_2.nextToken();
      String strCopy = str;
      
      int[] qOneArr = new int[q];
      int[] qTwoArr = new int[q];
      
      for(int i = 0; i < q; i++)
      {
         StringTokenizer st_3 = new StringTokenizer(f.readLine());
         int qOne = Integer.parseInt(st_3.nextToken());
         int qTwo = Integer.parseInt(st_3.nextToken());
         
         qOneArr[i] = qOne;
         qTwoArr[i] = qTwo;
      }
      
      ArrayList<Integer> stroke = new ArrayList<Integer>();
      String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      
      for(int i = 0; i < q; i++)
      {
         int qOneTest = qOneArr[i];
         int qTwoTest = qTwoArr[i];

         /*String strToAddSpace = str.substring(qOneTest - 1, qTwoTest);
         str = str.replaceFirst(strToAddSpace, "");*/
         
         int strokes = 0;
         
         /*if((qOneTest == 1) || (qTwoTest == n))
            strokes = 0;
         
         else
            strokes = 1;*/

         int newStrLength = str.length();
         boolean boolStroke = false;
         
         for(char k = 'A'; k <= 'Z'; k++)
         {
            boolStroke = false;
            
            for(int j = 0; j < newStrLength; j++)
            {
               if((str.charAt(j) < k) || (((qOneTest - 1) <= j) && ((qTwoTest - 1) >= j)))
                  boolStroke = false;
               
               else if(str.charAt(j) == k)
               {
                  if(boolStroke == false)
                  {
                     strokes++;
                     boolStroke = true;
                  }
               }                  
            }
         }
         
         stroke.add(strokes);
         str = strCopy;   
      }
      
      for(int i = 0; i < q; i++)
      {
         int strokeGet = stroke.get(i);
         System.out.println(strokeGet);
      }
   }
}
