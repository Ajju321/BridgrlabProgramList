package com.codewithajay;
import java.util.Scanner;
public class countword {

	public static void word(String word)
	{
		int count = 0;
	
		for(int i=0;i<word.length() && word.charAt(i)!=' ';i++)
		{	
			System.out.print(word.charAt(i));
//			if(word.charAt(i) ==' ')
//			{
//				count++;
//			}
		}
		String[] str2=word.split(" ");
		int len=str2.length/2;
		//System.out.println(len);
		for(int i=1;i<str2.length;i++)
		{
			System.out.print(word.charAt(i));
		}
		
		//return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string : ");
str=sc.nextLine();

String[] arr=str.split(" ");
int len=arr.length/2;
for(int i=len;i>=0;i--)
{
    System.out.println(arr[i]);
}
//System.out.print("Total Number of Words in Entered Sentence is "+);
//word(str);
	}

}
