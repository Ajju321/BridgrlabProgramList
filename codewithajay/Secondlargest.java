package com.codewithajay;

public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {12,66,88,45,76,23,45,89,65,45,90,43};

  int largest=arr[0];
  int slargest=arr[0];
  int i;
  System.out.println("Display the Array  ");
  for( i=0;i<arr.length;i++)
  {
	  System.out.print(arr[i]+" ");
  }
  for(i=0;i<arr.length;i++)
  {
	  if(arr[i]>largest)
	  {
		  
		  slargest=largest;
		  largest=arr[i];
		  
	  }
	  else if(arr[i]>slargest)
	  {
		  slargest=arr[i];
	  }
  }
  System.out.println("second largest lement is "+slargest);
	}

}
