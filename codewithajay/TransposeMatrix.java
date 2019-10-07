package com.codewithajay;
import java.util.Scanner;
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int i,j,row,col;
    System.out.println("Enter the rows and columns in array ");
    row=sc.nextInt();
    col=sc.nextInt();
    int[][]arr=new int[row][col];
    System.out.println("Enter the elements in the array :");
     for(i=0;i<row;i++)
     {
    	 for(j=0;j<col;j++)
    	 {
    		 arr[i][j]=sc.nextInt();
    	 }
     }
     System.out.println("Display the mateix without transpose ");
     for(i=0;i<row;i++)
     {
    	 for(j=0;j<col;j++)
    	 {
    	   System.out.print(arr[i][j]+" ");
    	 }
    	 System.out.println();
     }

     System.out.println("Display the mateix with transpose ");
     for(i=0;i<row;i++)
     {
    	 for(j=0;j<col;j++)
    	 {
    	   System.out.print(arr[j][i]+" ");
    	 }
    	 System.out.println();
     }
	}

}
