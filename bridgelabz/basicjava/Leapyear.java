package com.bridgelabz.basicjava;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the year : ");
		num=sc.nextInt();
		
		if(num>=1582 && num%4==0 && num%100==0 && bum%400==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not leap year");
		}
	}

}
