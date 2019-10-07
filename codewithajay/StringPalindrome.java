package com.codewithajay;
import java.util.Scanner;


public class StringPalindrome {
	static int i,j;
	static String str,rev="";
	
	public static boolean palindrome(String str)
	{
		int length=str.length()-1;
		for(i=length;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			return true;
		}
		return false;
		
	}
	
	public static boolean palindrome1(String str)
	{
		i=0;
		j=str.length()-1;
		
		while(i<j)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				
				return false;
			}
			
			i++;
			j--;
			System.out.print(str.charAt(j));
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
System.out.print("Enter the String : ");
str=sc.nextLine();

boolean result=palindrome1(str);
System.out.println(result);
	}

}
