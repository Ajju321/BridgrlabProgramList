package com.bridgelabz.basicjava;
import java.util.Scanner;
public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i,j,temp,num;
         int flag=0;
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter the size of the array : ");
          num=sc.nextInt();
          int[] arr=new int[num];
          System.out.println("Enter the elementsin array : ");
          for(i=0;i<num;i++)
          {
        	  arr[i]=sc.nextInt();
          }
          
          for(i=0;i<num;i++)
          {  flag=0;
        	  for(j=0;j<num-1;j++)
        	  {
        		
        		  if(arr[j]>arr[j+1])
        		  {
        			  temp=arr[j];
        			  arr[j]=arr[j+1];
        			  arr[j+1]=temp;
        			  flag=1;
        			  System.out.print(temp);
        			 
        		  }
               System.out.print(flag);
        	  }
        	  if(flag==0)
       	  {break;}
          }
          for(i=0;i<num;i++)
          {
        	  System.out.println(arr[i]);
          }
//          for(i=0;i<num;i++)
//          {
//        	  System.out.println(arr[i]);
//          }
          
	}

}
