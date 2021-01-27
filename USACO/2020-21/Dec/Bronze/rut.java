//Passes 5/10 test cases

import java.util.*;
import java.io.*;

class rut
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

      StringTokenizer st = new StringTokenizer(read.readLine());
      
      int n = Integer.parseInt(st.nextToken());
      
      ArrayList<String> direc = new ArrayList<String>();       //stores direction (E or N)     
      ArrayList<Integer> nums = new ArrayList<Integer>();
      ArrayList<String> stillCanGo = new ArrayList<String>();
      ArrayList<Integer> xCoords = new ArrayList<Integer>();
      ArrayList<Integer> yCoords = new ArrayList<Integer>();
      
      String[][] newArray = new String[1500][1500];
      String[][] newArray3 = new String[1500][1500];
      
      for(int i = 0; i < n; i++)
      {
         StringTokenizer st_1 = new StringTokenizer(read.readLine());
         
         String dir = st_1.nextToken();
         int xCoord = Integer.parseInt(st_1.nextToken());
         int yCoord = Integer.parseInt(st_1.nextToken());
         
         newArray[xCoord][yCoord] = "FILLED";
         
         xCoords.add(xCoord);
         yCoords.add(yCoord);
         direc.add(dir);         
         nums.add(1);
         stillCanGo.add("YES");   
      }
      
      for(int k = 1; k < 500; k++)
      {
         for(int i = 0; i < nums.size(); i++)
         {
            int x = xCoords.get(i);
            int y = yCoords.get(i);
            
            if(stillCanGo.get(i).equals("YES"))
            {
               if(direc.get(i).equals("E"))
               {
                  if((i == 0) && (newArray[x + 1][y] != "FILLED"))
                     newArray3[x + 1][y] = "JUST SET HERE";
                     
                  if((newArray[x + 1][y] != "FILLED") || (newArray3[x + 1][y] == "JUST SET HERE"))
                  {
                     newArray[x + 1][y] = "FILLED";
                     newArray3[x + 1][y] = "JUST SET HERE";
                     int numss = nums.get(i) + 1;
                     
                     nums.set(i, numss);
                     xCoords.set(i, x + 1);
                  }
                  
                  else if(newArray3[x + 1][y] != "JUST SET HERE")
                     stillCanGo.set(i, "NO");
               }
               
               else
               {
                  if((i == 0) && (newArray[x][y + 1] != "FILLED"))
                     newArray3[x][y + 1] = "JUST SET HERE";
                     
                  if((newArray[x][y + 1] != "FILLED") || (newArray3[x][y + 1] == "JUST SET HERE"))
                  {
                     newArray[x][y + 1] = "FILLED";
                     newArray3[x][y + 1] = "JUST SET HERE";  
                     int numss = nums.get(i) + 1;
                     
                     nums.set(i, numss);
                     yCoords.set(i, y + 1);
                  }
                  
                  else if(newArray3[x][y + 1] != "JUST SET HERE")
                     stillCanGo.set(i, "NO");
               }
            }
            
            if(i == nums.size() - 1)
               for(int j = 0; j < 1500; j++)
                  for(int l = 0; l < 1500; l++)
                     newArray3[j][l] = "SET PREVIOUSLY";
         }
      }
      
      for(int i = 0; i < n; i++)
      {
         int move = nums.get(i);
         
         if(move == 500)
            System.out.println("Infinity");
         
         else
            System.out.println(move);
      }
   }
}
