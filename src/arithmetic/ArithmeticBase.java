/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and add object oriented principles satisfy as comment in the code
 * @author sivagamasrinivasan
 * Modifier: Sargun Josun(991541997)
 * date 10/22
 */
public class ArithmeticBase 
{
 private double x,y;
 public enum Operations{PLUS,MINUS,TIMES,DIVIDE};
 /**
     * @return the x
     */
    public double getX() 
    {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
    
    public void calculate(double x, double y) 
        {
        for(Operations o: Operations.values())
        {
        switch (o) 
        {
            
                case PLUS:
                    System.out.println("THe addition is "+(x+y));
                    break;
                case MINUS:
                    System.out.println("The subtraction is "+(x-y));
                    break;
                case TIMES:
                    System.out.println("The multiplication is "+(x*y));
                    break;
                case DIVIDE:
                    System.out.println("The division is "+(x/y));
                    break;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
        }
          

    }

    
   
}
