package com.codewithajay;
import java.util.Scanner;
public class MatrixRowCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		  int i,j,col,row;
		  System.out.println("Enter the rows : ");
		  row=sc.nextInt();
		  
		  System.out.println("Enter the cols : ");
		  col=sc.nextInt();
		  
		  int[][] arr=new int[row][col];
		  
		  System.out.println("Enter the elements in the array : ");
		  
		  for(i=0;i<row;i++)
		  {
			  for(j=0;j<col;j++)
			  {
				  arr[i][j]=sc.nextInt();
			  }
		  }
		  
		  for(i=0;i<row;i++)
		  {
			  for(j=0;j<col;j++)
			  {
				  //arr[i][j]=sc.nextInt();
				
				  System.out.print(arr[i][j]+" ");
				
			  }
			  System.out.println();
		  }
	}

}
