package com.codewithajay;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,row,col;
		System.out.println("Enter the rows and cols ");
		col=sc.nextInt();
		row=sc.nextInt();
		int[][] arr=new int[row][col];
		
		System.out.println("Enter the lements in matrix : ");
		
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
				if(i>j)
				{
					System.out.print(arr[i][j]+" ");
				}
				else
				{
					System.out.print(" 0 ");
				}
			}
			System.out.println();
		}
	}

}
