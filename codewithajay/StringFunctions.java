package com.codewithajay;
import java.util.Arrays;
import java.util.Scanner;
public class StringFunctions {

static String str1,str2;
static int len1,len2,len,found=0,not_found=0,i,j;


public static boolean Anagram(String str1,String str2)
{
		/*
		 * len1=str1.length(); len2=str2.length(); boolean temp=true; if(len1==len2) {
		 * len=len1; for(i=0;i<len;i++) {
		 * 
		 * for(j=0;j<len;j++) { if(str1.charAt(i)==str2.charAt(j)) { return true;
		 * 
		 * } }
		 * 
		 * }
		 * 
		 * } else { System.out.println("Both String  length is not match "); }
		 */
//  return false;
	
	  char[] a=str1.toCharArray();
 	  char[] b=str2.toCharArray();
 	  Arrays.sort(a);
 	  Arrays.sort(b);
	
	    
	
	return Arrays.equals(a, b);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First String  : ");
		str1=sc.nextLine();
		System.out.print("\nEnter the Second String  : ");
		str2=sc.nextLine();
		StringFunctions sf=new StringFunctions();
	
		if(Anagram(str1,str2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println(" not Anagram");
		}
	  
		
	}

}
