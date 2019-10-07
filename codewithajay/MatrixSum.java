package com.codewithajay;
import java.util.Scanner;
public class MatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int i,j,row,col,sum=0,product=1;
		System.out.println("Enter the rows and cols for matrix ");
		row=sc.nextInt();
		col=sc.nextInt();
		int[][] arr=new int[row][col];
				System.out.println("Enter the rows and cols for matrix ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Sum rows and cols for matrix ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				sum =sum+arr[i][j];
				product=product*arr[i][j];
			}
	}
		
		System.out.println("Sum of matric is : "+sum);
		System.out.println("Product of matric is : "+product);

}
}
