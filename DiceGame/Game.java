import java.util.*;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
   
    public static void main(String[] args)
    
  {
    Scanner in= new Scanner(System.in);
    int k;
    int p;
    char goAgain;
    Die dice1;
    Die dice2;
    int sum;
    char yesAgain;
    

    do{
    dice1 = new Die();
    dice2 = new Die();
    
    sum= dice1.getValue()+ dice2.getValue();
    if(sum== 7||sum==11)
    {
    System.out.println("Congratulations You have won the came. Game Over");
     System.out.println(dice1.toString());
                 System.out.println(dice2.toString());
    System.out.println("Your total was: "+sum);
    }
    else if(sum== 2||sum==3||
    sum==12)
    {
        System.out.println("Sorry you lost Game Over.");
     System.out.println(dice1.toString());
                 System.out.println(dice2.toString());
         System.out.println("Your total was: "+sum);
    }
    
    if(sum==4||sum==5||sum==6||sum==8||sum==9||sum==10)
    {
    System.out.println("Thowers Point.");
       System.out.println(dice1.toString());
       System.out.println(dice2.toString());
         System.out.println("Go again"); 
       System.out.println("Your total was: "+sum);
       if (sum==7)
        {
        System.out.println("You Lose");
        System.out.println(dice1.toString());
        System.out.println("Your total was"+sum);
        }
     
   
       while(sum!=7&&sum==sum)
       {
            
                 
        dice1.setValue();
        dice2.setValue();
         int sum2= dice1.getValue()+dice2.getValue();
        System.out.println("Dice 1");
        System.out.println(dice1.toString());
        System.out.println("Dice 2");
             System.out.println(dice2.toString());
             System.out.println("Go again");
             yesAgain= in.next().charAt(0);
            
            }
        System.out.println("You WIN");
        
         }
      dice1.toString();
      dice2.toString();
     System.out.println("Press y to go Again");
     goAgain= in.next().charAt(0);
    }while('y'==goAgain);
    System.out.println("Good-bye");
           
    }
 
}
