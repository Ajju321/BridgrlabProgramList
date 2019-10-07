package PracticeW;
import java.util.Scanner;
public class Palindrome {
	 static String rev="";

	public static boolean canpalidrome(String orig)
	{
				
		 int len=orig.length();
			for(int i=len-1;i>=0;i--)
			{
				rev=rev+orig.charAt(i);
			}
			//System.out.println(rev);
			if(orig.equals(rev))
			{
				return true;
			}
			else
			{
				return false;
			 }	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str,orig;
	  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check the palinfrom");
		orig=sc.nextLine();
		
		if(canpalidrome(orig)==true)
		{
			System.out.println("Yes");
			System.out.println(rev);
		}
		else
		
		{
			System.out.println("No");
		//System.out.println(orig);
		}

		
	
	}

}
