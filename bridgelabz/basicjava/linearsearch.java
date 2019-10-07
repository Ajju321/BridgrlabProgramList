package com.bridgelabz.basicjava;
import java.util.Scanner;
public class linearsearch {

	public static int search(int arr[],int x)
	{
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==x)
			{
				return i;
			}
		
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

     int[] arr= {11,22,33,44,55,66,77,88,99};

     
        int x=12;
   
     System.out.println("Ente the element to searching : ");
     int result=search(arr,x);
     
     if(result==-1)
     {
    	 System.out.println("element is not found ");
     }
     else
     {
    	 System.out.println("element is found at "+result+" position");
     }


	}

}
