import java.util.Scanner;
import java.io.*;
import java.text.*;
public class PDA
{
  public static void main(String args[]) {
    Scanner age = new Scanner(System.in);
    System.out.print("What's your age? " );
    if(age.hasNextDouble()){
      double a = age.nextDouble();
      NumberFormat fmt = NumberFormat.getNumberInstance();
      fmt.setMaximumFractionDigits(0);
      fmt.setMinimumFractionDigits(0);
      String s = fmt.format(a);
      
      double n = Double.parseDouble(s);
      double p = n;
      double x = p/2+7;
      double y = 2*p-x;
    
      System.out.print("Your permissable dating age is between: " + x + " and " + y);
    }
    else{
      System.out.println("Input a number you hooligan!");
    }
  }
}
