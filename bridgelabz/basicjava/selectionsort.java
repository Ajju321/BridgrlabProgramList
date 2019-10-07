package com.bridgelabz.basicjava;
import java.util.Scanner;
public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,temp,size,min_ind=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter thesiz eof array : ");
size=sc.nextInt();
int[] arr=new int[size];

System.out.println("Enter the lement in the array : ");
for(i=0;i<size;i++)
{
	arr[i]=sc.nextInt();
}
for(i=0;i<size-1;i++)
{
	min_ind=i;
	for(j=i+1;j<size;j++)
	{
		if(arr[j]<arr[min_ind])
		{
			min_ind=j;
		}
	
	}	temp=arr[min_ind];
	arr[min_ind]=arr[i];
	arr[i]=temp;
	
}

System.out.print("Display the Array elements :");
for(i=0;i<size;i++)
{
	System.out.print(arr[i]+" ");
	}

	}

}
