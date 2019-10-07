package com.codewithajay;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int size,row,col,i,j;

Scanner sc=new Scanner(System.in);
//System.out.println("Enter the columns : ");
//col=sc.nextInt();
System.out.println("Enter the columns : ");
row=sc.nextInt();
int[] arr=new int[row];
System.out.println("Enter the elements in array  ");
for(i=0;i<row;i++)
{
	   arr[i]=sc.nextInt();
}
System.out.println("Display the matrix here ");
for(i=0;i<row;i++)
{

	   //arr[i][j]=sc.nextInt();
	   System.out.println(arr[i]+" ");
  
}
	}

}
