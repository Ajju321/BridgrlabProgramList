package com.codewithajay;
import java.util.Random;
import java.util.Scanner;
public class Flipcoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Random rand=new Random();
int tailsum=0,headsum=0;
int flip;
double heads=0,tails=0;
double randnum=0;
int counter=0;
		//simulate the program 1 to 10
Scanner sc=new Scanner(System.in);
//<0.5 program 
//System.out.println("how much flip do you want : ");
//flip=sc.nextInt();
//		while(counter<=flip)
//		{
//			randnum=(double) Math.random()*1;
//			if(randnum<0.5)
//			{
//				//System.out.println("head");
//				head=head++;
//				//headsum=headsum+head;
//		
//				//System.out.println(head);
//			}
//			else {
//				//System.out.println("tail");
//				//tailsum=tailsum+i;
//				tail=tail++;
//				//tailsum=tailsum+head;
//			}
//
//			counter++;
//		}
//		
//		System.out.println("head  : "+head);
//		double headper=headsum/flip*100;
//		System.out.println("percentage of head : "+headper);
//		System.out.println("head  : "+tail);
//		double tailper=tailsum/flip*100;;
//		System.out.println("percentage of head : "+tailper);

//find the head and tails and then show the percentage of the head and tails

System.out.println("Enter the how much flip to do you want :");
flip=sc.nextInt();
Random rand=new Random();
for(int i=0;i<flip;i++)
{
	if(rand.nextInt(2)==0)
	{
		System.out.println("head");
		heads++;
	}
	else
	{
		System.out.println("tail");
		tails++;
	}
}
double percentHeads = heads/flip*100;
double percentTails = (flip-heads)/flip*100;
System.out.println(" heads is: " +percentHeads);
System.out.println(" tails is: " +percentTails);

//double tailper=(tail/flip)*100;
//System.out.println("heads percentage "+tailper);
//System.out.println("tails "+tail);


	}

}
