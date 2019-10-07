package com.bridgelabz.basicjava;
import java.util.Scanner;
public class bubblesortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,size;
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the siz eof array  : ");
		size=sc.nextInt();
		String[] arr=new String[size];
		System.out.println("Enter the lements in array : ");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextLine();
		}
		
		for(i=0;i<size;i++)
		{
			for(j=0;j<size-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print("display the elemements inside the array : ");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
