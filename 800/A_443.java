//Link to Problem: https://codeforces.com/problemset/problem/443/A
//Date: 11/24/2020

import java.io.*;
import java.util.*;
 
public class A_443
{
   public static void main(String[] args) throws IOException
   {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      
      str = str.replace("{", "");
      str = str.replace("}", "");
      str = str.replace(",", "");
      str = str.replace(" ", "");
      
      if(!str.equals(""))
      {
         str = str.toLowerCase();
         String letters = "abcdefghijklmnopqrstuvwxyz";
         
         ArrayList<Integer> firstNums = new ArrayList<Integer>();
         ArrayList<Integer> distinct = new ArrayList<Integer>();
         
         for(int i = 0; i < str.length(); i++)
            for(int k = 0; k < letters.length(); k++)
               if(str.charAt(i) == letters.charAt(k))
                  firstNums.add(k);
         
         Collections.sort(firstNums);
         int curr = firstNums.get(0);
         distinct.add(curr);
                   
         for(int i = 1; i < firstNums.size(); i++)
         {
            int next = firstNums.get(i);
            
            if(next != curr)
            {
               distinct.add(next);
               curr = next;
            }
            
            else
               curr = next;
            
         }
         
         int size = distinct.size();
         System.out.println(size);
      }
      
      else
         System.out.println(0);
   }
}