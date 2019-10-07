package com.bridgelabz.basicjava;
import java.util.Scanner;

public class Selectionsortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int i,j,size,min_ele;
  String temp;
     Scanner sc=new Scanner(System.in);
     System.out.print("enter the size of array : ");
     size=sc.nextInt();
     String[] arr=new String[size];
     
     System.out.println("Enter the elements in the array : ");
 	for(i=0;i<size;i++)
	{
		arr[i]=sc.nextLine();
	
	}
 
//     for(i=0;i<size-1;i++)
//     {
//    	 min_ele=i;
//    	 for(j=i+1;j<size;i++)
//    	 {
//    		 if(arr[j].compareTo(arr[min_ele])<0) {
//    			 min_ele=j;
//    		 }
//    		 temp=arr[min_ele];
//     		arr[min_ele]=arr[i];
//     		arr[i]=temp;	 
//    	 }
//    	 
//    		
//     }
 	for(i=0;i<size-1;i++)
 	{
 		min_ele=i;
 		for(j=i+1;j<size;j++)
 		{
 			if(arr[j].compareTo(arr[min_ele])<0)
 			{
 				min_ele=j;
 			}
 		
 		}	temp=arr[min_ele];
 		arr[min_ele]=arr[i];
 		arr[i]=temp;
 		
 	}
 	System.out.print("Display the Array elements :");
 	for(i=0;i<size;i++)
 	{
 		System.out.print(arr[i]+" ");
 		}

     
	}

}
