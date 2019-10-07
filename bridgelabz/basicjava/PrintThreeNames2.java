package com.bridgelabz.basicjava;
import java.util.Scanner;
public class PrintThreeNames2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String[] arr=new String[3];
		  int i;
		  String input=" ";
		  String output=" " ;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the three Names : ");
		  for(i=0;i<=3-1;i++)
		  {
			  arr[i]=sc.nextLine();
		  }
	
		  for(i=0;i<=2;i++)
		  {

	
			 input+=arr[i];
			 
		  }
		
		  for(i=2;i>=0;i--)
		  {
			  output +=arr[i];
		  } 
		  System.out.println("Displaying the first output : ");
		  System.out.println(" java PrintThreeNames "+input);
		  System.out.println("Display the second output : ");
		  System.out.println(" hii "+output);
		  
	}

}
