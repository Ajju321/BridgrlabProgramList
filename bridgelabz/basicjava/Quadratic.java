package com.bridgelabz.basicjava;
import java.util.Scanner;
import java.lang.Math; 
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,r,x,delta;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		System.out.println("Enter the third number");
		c=sc.nextInt();
		
		delta=b*b-4*a*c;
		x=(int) ((-b+ Math.sqrt(delta))/(2*a));
		System.out.println("first root "+x);
		
		x=(int) ((-b+ Math.sqrt(delta))/(2*a));
		System.out.println("second root "+x);
		
		r=a*x*x+b*x+c;
		System.out.println("2 root final aquations is  value of x  "+r);
	}


}
