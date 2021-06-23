package com.bridgelabz;
import java.util.Scanner;
public class EuclideanDistance {
    /**
     * taking x,y values from user and calling euclideanDist.
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Calculating Euclidean Distance");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x in cartesian point:");
        int x=sc.nextInt();
        System.out.println("enter the value of y in cartesian point:");
        int y=sc.nextInt();
        euclideanDist(x,y);
    }
    /**
     *Calculating euclidean distance.
     * @param x
     * @param y
     */
    public static void euclideanDist(int x,int y) {
        float dist=(float) Math.sqrt((x*x)+(y*y));
        System.out.println("Euclidean Distance of ("+x+","+y+") is "+dist);
    }
}
