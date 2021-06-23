package com.bridgelabz;
import java.util.Scanner;
public class TwoDimArray {
    static Scanner scanner = new Scanner(System.in);
    /**
     * Taking rows and columns from user and calling twoDimArray by passing rows and columns.
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Enter the no.of Rows: ");
        int rows=scanner.nextInt();
        System.out.println("Enter the no.of Columns: ");
        int columns=scanner.nextInt();
        twoDimArray(rows,columns);
    }
    /**
     * Creating a twoDimArray method it takes array values from user and prints it.
     * @param rows
     * @param columns
     */
    public static void twoDimArray(int rows,int columns) {
        int[][] twoDimArray = new int [rows][columns];
        System.out.println("enter the elements of the array:");
        for(int i=0; i < rows; i++)
        {
            for(int j=0; j < columns; j++)
            {
               twoDimArray[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Array elements are :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("arr[" + i + "][" + j + "]="+ twoDimArray[i][j] +"\n ");
            }
        }
    }
}
