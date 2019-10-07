package com.bridgelabz.basicjava;
import java.util.Scanner;
public class intOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		  int a,b,c,r;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the first number ");
		  a=sc.nextInt();
		  System.out.println("Enter the second number ");
		  b=sc.nextInt();
		  System.out.println("Enter the third number ");
		  c=sc.nextInt();
		  
		  r=a+b*c;
		  System.out.println(r);
		  r=a*b+c;
		  System.out.println(r);
		  r=c+a/b;
		  System.out.println(r);
		  r=a%b+c;
		  System.out.println(r);

	}

}
