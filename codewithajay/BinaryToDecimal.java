package com.codewithajay;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int binnum,num,decnum=0,i=1,rem;
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Binary number ");
	binnum=sc.nextInt();
	
	while(binnum!=0)
	{
		rem=binnum%10;
		decnum=decnum+rem*i;
		i=i*2;
		binnum=binnum/10;
		
	}
	
	System.out.println("binary to decimal number coversion : "+decnum);
	}

}
