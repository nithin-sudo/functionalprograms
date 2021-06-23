package com.bridgelabz;
import java.util.Scanner;
public class Quadratic {
    /**
     * taking a,b,c values from user and calling quadratic method by passing arguments.
     * @param args
     */
    public static void main(String[] args){
        System.out.println("calculating quadratic roots of the equation");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of 'a' in Quadratic equation:");
        int a= scanner.nextInt();
        System.out.println("Enter the value of 'b' in Quadratic equation:");
        int b= scanner.nextInt();
        System.out.println("Enter the value of 'c' in Quadratic equation:");
        int c= scanner.nextInt();
        System.out.println("The roots of the equation "+a+"x^2+"+b+"x+"+c+" are ");
        quadratic(a,b,c);
    }
    /**
     * calculating roots of quadratic equation.
     * @param a
     * @param b
     * @param c
     */
    public static void quadratic(int a,int b,int c)
    {
        int delta=b*b - 4*a*c;
        if(delta>=0)
        {
            double root1=(-b +Math.sqrt(delta))/(2*a);
            double root2=(-b -Math.sqrt(delta))/(2*a);
            System.out.println("roots are"+root1+","+root2);
        }
        else
        {
            System.out.println("roots are imaginary because delta is less than zero");
        }
    }
}
