package com.codewithajay;

public class CarLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int y=Integer.parseInt(args[0]);
int p=Integer.parseInt(args[1]);
int r=Integer.parseInt(args[2]);

int payment;
  int n=12*y;
  int R=r/(12*100);
  payment=p*r/1-(1+r)^(-n);
  
  System.out.println("Compound monthly intrest is : "+payment);
	}

}
