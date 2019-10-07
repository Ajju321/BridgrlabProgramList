package com.bridgelabz.basicjava;
import java.util.Scanner;
public class binarysearch {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     int i,j,size,f;
		 int min=0;
     	 int mid;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		size=sc.nextInt();
		
		  int[] arr=new int[size];
		  int max=arr.length;
		  mid=(min+max)/2;
		  System.out.println("Enter the element in the array :");
		  for(i=0;i<size;i++)
		  {
			  arr[i]=sc.nextInt();
		  }
		  System.out.println("Enter the element to search : ");
		  f=sc.nextInt();
		  
		while(min<=max)
		{
			if(arr[mid]==f)
			{
				System.out.println("element is at "+mid+" position ");
				break;
			}
			else if(arr[mid]<f)
			{
			
				if(min==f)
				{
					System.out.println(" min Element is found at "+min+" position");
				}
				min=mid+1;
			}
			else
			{
				
				if(max==f)
				{
					System.out.println("max Element is found at "+max+" position ");
				}
				max=mid-1;
			}
			mid=(max+min)/2;
		}
//		if(min>max)
//		{System.out.println("element is not found ");}
//		  
	
		
	}

}
