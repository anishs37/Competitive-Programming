import java.util.*;
import java.io.*;

class paint
{
   public static void main(String[] args) throws IOException
   {      
      BufferedReader f = new BufferedReader(new FileReader("paint.in"));
      PrintWriter outfile = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
      
      //BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st_1 = new StringTokenizer(f.readLine());
      
      int a = Integer.parseInt(st_1.nextToken());
      int b = Integer.parseInt(st_1.nextToken());

      StringTokenizer st_2 = new StringTokenizer(f.readLine());
      
      int c = Integer.parseInt(st_2.nextToken());
      int d = Integer.parseInt(st_2.nextToken());
      
      if((d >= a) && (b >= c))
      {
         ArrayList<Integer> nums = new ArrayList<Integer>();
         
         nums.add(a);
         nums.add(b);
         nums.add(c);
         nums.add(d);
         
         Collections.sort(nums);
         
         int smallestNum = nums.get(0);
         int largestNum = nums.get(3);
         
         outfile.println(largestNum - smallestNum); 
      }
      
      else
      {
         int sum1 = b - a;
         int sum2 = d - c;
         
         outfile.println(sum1 + sum2);
      }
      
      outfile.close();
   }
}