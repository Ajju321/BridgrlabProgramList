package com.codewithajay;
import java.util.Scanner;
public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int die1,max,one=0,two=0,three=0,four=0,five=0,six=0;
        int roll;
        Scanner sc=new Scanner(System.in);
        System.out.println("How much time do you want to roll a die : ");
        roll=sc.nextInt();
		  for(int i=1;i<=roll;i++)
		  {
			  die1 = (int)(Math.random()*6) + 1;
			  System.out.println(die1);
			  
			  switch(die1)
			  {
			  case 1 : ++one;break;
			  case 2 : ++two;break;
			  case 3 : ++three;break;
			  case 4 : ++four;break;
			  case 5 : ++five;break;
			  case 6 : ++six;break;
			  
			  }
			  
		  }
		  System.out.println(" one repeat = "+one+" times \n "+ "two repeat = "+two+"times \n"+" three repeat = "+three+" times \n four repeat = "+four+"times\n five repeats = "+five+" times \n six repeats = "+six+" times");
	}

}
