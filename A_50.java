import java.io.*;
import java.util.*;
 
public class A_50
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
 
      StringTokenizer st_1 = new StringTokenizer(read.readLine());
      int m = Integer.parseInt(st_1.nextToken());
      int n = Integer.parseInt(st_1.nextToken());
      
      System.out.println(((m * n) / 2));
   }
}