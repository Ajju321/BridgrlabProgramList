package com.bridgelabz.basicjava;

public class binarysearchstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j;
        String[] arr= {"one","two","three","four","five","six"};
        int min=0;
        int max=arr.length;
        int mid=(max+min)/2;
       String k="five";
        
        while(min<=max)
        {
        	if(arr[mid].compareTo(k)<0)
        	{
        		System.out.println("String find at "+min+" position");
        		break;
        	}
        	else if(arr[min].compareTo(k)>0)
        	{
        		max=mid-1;
        	}
        	else
        	{
        		min=mid+1;
        	}
        	mid=(min+max)/2;
        }
        if(min>max) {System.out.println("Element is not found");}
	}

}
