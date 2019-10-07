package com.codewithajay;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
  for(i=1;i<=5;i++)
  {
	  for( j=1;j<=5;j++)
	  {
		  if(i<=j)
			  System.out.print("* ");
		  else
			  System.out.print(" ");
	  }
	  System.out.println();
  }
	  
	  for(i=2;i<=5;i++)
	  {
		  for(j=1;j<=5;j++)
		  {
			  if(j>=6-i)
				  System.out.print("* ");
			  else
				  System.out.print(" ");
		  }
		  System.out.println();
	  }
	}

}
