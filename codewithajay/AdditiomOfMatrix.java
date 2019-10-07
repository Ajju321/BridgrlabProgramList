package com.codewithajay;
import java.util.Scanner;
public class AdditiomOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,col,row;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cols and rows ");
		col=sc.nextInt();
		row=sc.nextInt();
		
		int[][] a=new int[row][col];
		int[][] b=new int[row][col];
		int[][] c=new int[row][col];
		System.out.println("Enter the elements of in first matrix ");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
    System.out.println("Enter the elements of in second matrix ");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
			b[i][j]=sc.nextInt();
			}
		}
		
System.out.println("Display");
for(i=0;i<row;i++)
{
	for(j=0;j<col;j++)
	{
	c[i][j]=a[i][j]+b[i][j];
	}
	
}

for(i=0;i<row;i++)
{
	for(j=0;j<col;j++)
	{
	System.out.print(c[i][j]+" ");
	}
	System.out.println();
}
	}

}
