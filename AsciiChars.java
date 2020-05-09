import java.util.Scanner;

public class AsciiChars 
{
  public static void printNumbers()
  {
    
    for (int i=48;i<=57;i++){
      
      System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
    }
  }

  public static void printLowerCase()
  {
    for (int i=97;i<=122;i++){
      
      System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
    }
  }

  public static void printUpperCase()
   {
    for (int i=65;i<=90;i++){
      
      System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
   }
  }
}

// 