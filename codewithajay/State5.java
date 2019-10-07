package com.codewithajay;

public class State5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
double s=0;
		for(i=1;i<=5;i++)
		{
	s=(double) (Math.random()*2);
	

		System.out.println(s);

		}
		System.out.println(Math.min(s,i));
		System.out.println(Math.max(i,5));
	}

}
