package com.codewithajay;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range,i,num;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the range do you want : ");
		 range=sc.nextInt();

		 int flag=0;
		 for(num=1;num<=range;num++)
		 {
		 for(i=2;i<num;i++)
		 {
			 if(num%i==0)
			 {
				 //System.out.println(i);
				 flag=0;
				 break;
			 }
			 else
			 {
			
				 flag=1;
			 }
			 
		   }
		 if(flag==1)
		 {
			 System.out.println(num);
		 }
//		 else
//		 {
//			 System.out.println(num+" is not prime number ");
//		 }
		 }
		
		 
	}

}
