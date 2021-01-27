import java.util.*;
import java.io.*;

class billboard
{
   public static void main(String[] args) throws IOException
   {      
      BufferedReader f = new BufferedReader(new FileReader("billboard.in"));
      PrintWriter outfile = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
      
      //BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st_1 = new StringTokenizer(f.readLine());
      int x1 = Integer.parseInt(st_1.nextToken());
      int y1 = Integer.parseInt(st_1.nextToken());
      int x2 = Integer.parseInt(st_1.nextToken());
      int y2 = Integer.parseInt(st_1.nextToken());
      
      StringTokenizer st_2 = new StringTokenizer(f.readLine());
      int x3 = Integer.parseInt(st_2.nextToken());
      int y3 = Integer.parseInt(st_2.nextToken());
      int x4 = Integer.parseInt(st_2.nextToken());
      int y4 = Integer.parseInt(st_2.nextToken());    
          
      StringTokenizer st_3 = new StringTokenizer(f.readLine());
      int x5 = Integer.parseInt(st_3.nextToken());
      int y5 = Integer.parseInt(st_3.nextToken());
      int x6 = Integer.parseInt(st_3.nextToken());
      int y6 = Integer.parseInt(st_3.nextToken());    
      
      int left1 = Math.max(x1, x5);
      int right1 = Math.min(x2, x6);
      int bottom1 = Math.max(y1, y5);
      int top1 = Math.min(y2, y6);
      
      int area1 = ((x2 - x1) * (y2 - y1));
      
      if((left1 < right1) && (bottom1 < top1))
      {
         area1 = ((x2 - x1) * (y2 - y1)) - ((right1 - left1) * (top1 - bottom1));
      }
      
      int left2 = Math.max(x3, x5);
      int right2 = Math.min(x4, x6);
      int bottom2 = Math.max(y3, y5);
      int top2 = Math.min(y4, y6);
      
      int area2 = ((x4 - x3) * (y4 - y3));
      
      if((left2 < right2) && (bottom2 < top2))
      {
         area2 = ((x4 - x3) * (y4 - y3)) - ((right2 - left2) * (top2 - bottom2));
      }
      
      outfile.println(area1 + area2);
      
      outfile.close();
   }
}