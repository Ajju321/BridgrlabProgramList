package com.bridgelabz.basicjava;
import java.util.Scanner;
import java.lang.Math; 
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(args[0]);
		//System.out.println(m);

		int y=Integer.parseInt(args[1]);
		
		int distance=(int) Math.sqrt(x*x+y*y);
		System.out.println(" "+distance);
	}

}
