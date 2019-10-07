package com.codewithajay;
import java.util.Scanner;
public class DiagonalMatrix {

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
		
		System.out.println("Diagonla matrix ");
		if(row==col)
		{
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					if(i==j)
					{
						System.out.print(arr[i][j]);
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("this is not squre matrix");
		}
	}

}
