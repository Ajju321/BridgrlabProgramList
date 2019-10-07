package com.codewithajay;
import java.util.Scanner;
public class SumEachRowMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int i,j,col,row,sum=0;
		System.out.println("Enter the rows and cols in  array : ");
		row=sc.nextInt();
		col=sc.nextInt();
		int[][] arr=new int[row][col];
		System.out.println("enter the array elements : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<row;i++)
		{ 
			sum=0;
			for(j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
				sum=sum+arr[i][j];
			}
			System.out.println(" = "+sum);
		}
		
	}

}
