package com.codewithajay;
import java.util.Scanner;
public class ColRowDiSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int col,row,j,i,sum=0,colsum=0,diasum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows and coulmns ");
		row=sc.nextInt();
		col=sc.nextInt();
		int[][] arr=new int[row][col];
		
		System.out.println("Enter the elements in the matrix ");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Rows Sum : ");
		for(i=0;i<row;i++)
		{
			sum=0;
			colsum=0;
			for(j=0;j<col;j++)
			{
			System.out.print(arr[i][j]);
			sum=sum+arr[i][j];
			colsum=colsum+arr[j][i];
		
			}
			System.out.println(" = "+sum);
			
			
		}
		System.out.println(colsum);
	
		
	}

}
