package com.bridgelabz.basicjava;
import java.util.Scanner;
public class countfrequntly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int j,k;
    int l=0;
    String str;
    char ch,i;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string : " );
   str=sc.nextLine();
     l=str.length();
    for(i='A';i<='Z';i++)
    {
    	k=0;
    	for(j=0;j<l;j++)
    	{
    		ch=str.charAt(j);
    		if(ch==i)
    		{
    			k++;
    		}
    	}
    	if(k>0)
    	{
    		System.out.println("the value of "+i+" is repeated  "+k+" times");
    	}
    }
	}

}
