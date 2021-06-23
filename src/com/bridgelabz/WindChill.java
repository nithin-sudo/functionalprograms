package com.bridgelabz;

import java.util.Scanner;

public class WindChill {
    /**
     * taking temperature and windspeed as inputs and calling windChill method.
     * @param args
     */
    public static void main(String[] args){
        System.out.println("calculating windchill");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of temperatue:");
        int temperature=scanner.nextInt();
        System.out.println("Enter the value of wind speed:");
        double windChill=scanner.nextInt();
        windChill(temperature,windChill);
    }
    /**
     * Calculating windchill.
     * @param t
     * @param v
     */
    public static void windChill(int t,double v)
    {
        if (t<50 && (v<120 || v>3))
        {
            double windChill=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
            System.out.println("windchill is"+windChill);
        }
        else{
            System.out.println("Enter valid inputs");
        }
    }
}
