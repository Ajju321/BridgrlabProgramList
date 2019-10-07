package PracticeW;
import java.util.Scanner;

public class RandomFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of flips ");
	int flip=sc.nextInt();
	
			int loopCount = 1;
			double result;
			double heads = 0;
			double tails = 0;
			while(loopCount <= flip)
			{
				result = Math.random();
				if(result <= .5) {
					heads++;
				}
				else
				{
				tails++;
				}
				loopCount = loopCount + 1;
			}
			double percentHeads = heads/flip*100;
			double percentTails = (flip-heads)/flip*100;
			System.out.println(" heads is: " +percentHeads);
			System.out.println(" tails is: " +percentTails);
		
		
		 }

		 }