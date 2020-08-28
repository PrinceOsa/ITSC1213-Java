import java.util.*;
import java.util.Scanner;
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
  public static void main(String[] args)
  {
     Scanner input= new Scanner(System.in);
    PayCheck pay1 = new PayCheck(.15, .09, .07);
    char goAgain;
    double inHW;
    double inHR;
    String type;
    String name1;
    String name2;
    int counter;
   do{
       System.out.println("Whats your last name");
       name1= input.next();
       System.out.println("Whats your first Name");
       name2= input.next();
       System.out.println("How many hours did you work this week?");
       inHW= input.nextDouble();
       System.out.println("How much do you get pay per hour");
       inHR= input.nextDouble();
       
       pay1.setPayCheck(inHR, inHW, name1, name2);
       System.out.println(pay1.toString());

       System.out.println("Press y if you would like to Recalculate");
       goAgain = input.next().charAt(0);
    }while('y'==goAgain);
    System.out.println("Good-bye");
}
}
