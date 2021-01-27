//Passes 10/20 test cases

import java.util.*;
import java.io.*;

class danceMooves
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader f = new BufferedReader(new InputStreamReader(System.in));  
        
      StringTokenizer st_1 = new StringTokenizer(f.readLine());
      int n = Integer.parseInt(st_1.nextToken());              //number of cows
      int k = Integer.parseInt(st_1.nextToken());              //number of dance moves
      
      int[] noChangeArr = new int[n];                          //represents nums 1 to n
      int[] arr = new int[n];                                  //represents # positions cow visited
      int[] posArr = new int[n];                               //represents current position of the cow
      String[][] visitedArr = new String[n][n];                     
      ArrayList<Integer> moves = new ArrayList<Integer>();     //same thing as arr but as an ArrayList
      int[] moves1 = new int[k];                               //represents first position to change
      int[] moves2 = new int[k];                               //represents second position to change
      
      for(int i = 0; i < n; i++)
      {
         noChangeArr[i] = i + 1;
         posArr[i] = i + 1;
         arr[i] = 1;                //each cow starts off with one position visted
         moves.add(1);   
         visitedArr[i][i] = "VISITED";
      }
      
      for(int i = 0; i < n; i++)
         for(int j = 0; j < n; j++)
            if(i != j)
               visitedArr[i][j] = "NOT VISITED";
      
      for(int i = 0; i < k; i++)
      {
         StringTokenizer st_2 = new StringTokenizer(f.readLine());
         int a = Integer.parseInt(st_2.nextToken());
         int b = Integer.parseInt(st_2.nextToken());
         
         moves1[i] = a;
         moves2[i] = b;
      }     
      
      for(int rep = 0; rep <= 2000; rep++)
      {
         for(int i = 0; i < k; i++)
         {
            int move1 = moves1[i];
            int move2 = moves2[i];
            
            int temp1 = posArr[move1 - 1];
            int temp2 = posArr[move2 - 1];
            
            posArr[move1 - 1] = temp2;           //switches positions of two cows
            posArr[move2 - 1] = temp1;
            
            if(!visitedArr[temp2 - 1][move1 - 1].equals("VISITED"))
            {
               visitedArr[temp2 - 1][move1 - 1] = "VISITED";
               arr[temp2 - 1]++;
            }
            
            if(!visitedArr[temp1 - 1][move2 - 1].equals("VISITED"))
            {
               visitedArr[temp1 - 1][move2 - 1] = "VISITED";
               arr[temp1 - 1]++;
            }         
         }
      }

      for(int i = 0; i < n; i++)
      {
         int move = arr[i];       
         System.out.println(move);
      } 
   }
}
