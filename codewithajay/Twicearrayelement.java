package com.codewithajay;

public class Twicearrayelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {11,22,33,11,44,55,66,55,55,55,77,88,99,11,33,11,11,11};
		int i,j,flag=0;
		//System.out.println(arr.length);
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] )
				{
					if(arr[i]==i)
					{
					System.out.println(arr[i]);
					
				    flag=0;
					}
				}
			}
			if(flag==0) {break;
				}
			}
			
		
		
	}

}
