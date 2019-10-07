package com.codewithajay;

public class MathFunction {

	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		//return true;
		return false;
	}
	public static void isprime1(int p)
	{
		int count=0;
		
		for(int i=1;i<=p;i++)
		{
			if(p%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.print("Prime number");
		}
		else
		{
			System.out.print("Not Prime number");
		}
	}
	public static void main(String[] args) {
		
		//System.out.println(isPrime(5));
		System.out.println();
		MathFunction m=new MathFunction();
		m.isprime1(11);
		
	}
}
