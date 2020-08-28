import java.util.*;
import java.lang.*;
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{
   int sides;
   Random value= new Random();
   int face;
    public Die()
   {
    sides=6;
    face = (int)value.nextInt(sides);
    }
    public void Die(int s)
    {
     sides= s;
    face = (int)value.nextInt(sides);
    }
    public void setValue()
    {

   face = (int)value.nextInt(sides);
    }
    public void setSides(int si)
    {
    sides= si;
    }
    
    public int getSides()
    {
    return sides;
    }
    public int getValue()
    {
    return face;
    }
    public String toString()
    {
    return "Sides: "+ sides+
    "\nNumber Rolled: " +face;
    
    }
}
