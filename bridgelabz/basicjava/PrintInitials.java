package com.bridgelabz.basicjava;
import java.util.Scanner;
public class PrintInitials {

	
	public static String Printstarting(String name)
	{
		String result="";
		boolean v=true;
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==' ')
				 v=true;
			else if(name.charAt(i)!=' '&& v==true)
			{
				result=result+name.charAt(i);
				v=false;
			}
		
		}
		return result.toUpperCase();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		str=sc.nextLine();

		System.out.println(Printstarting(str));
		
		char[] arr=Printstarting(str).toCharArray();
		for(int k=0;k<arr.length;k++)
		{ 
		//	System.out.print(arr[i]);
			switch(arr[k]) {
			case 'A':
				
		         for(int i=1;i<=9;i++)
             	{
             		for(int j=1;j<=9;j++)
             		{
             		if(j==1||j==9||i==1||i==5)
             		{
             			System.out.print("*");
             		}
             		else
             		{
             			System.out.print(" ");
             		}
             		
             		}System.out.println();
             	}
		        
				break;
		     case 'B':
		    	 
		    	  for(int i=1;i<=9;i++)
	             	{
	             		for(int j=1;j<=9;j++)
	             		{
	             		if(i==1||i==5||i==9||j==9||j==1)
	             		{
	             			System.out.print("*");
	             		}
	             		else
	             		{
	             			System.out.print(" ");
	             		}
	             		
	             		}System.out.println();
	             	}
		    	 break;
			case 'C': 
				for(int i=1;i<=9;i++)
         	{
         		for(int j=1;j<=9;j++)
         		{
         		if(i==1|i==9||j==1)
         		{
         			System.out.print("*");
         		}
         		else
         		{
         			System.out.print(" ");
         		}
         		
         		}System.out.println();
         	}break;
			case 'D':System.out.print("d");break;
			case 'E':System.out.print("e");break;
			}
		}
		}


}
