package com.codewithajay;
import java.util.Scanner;

import com.codewithajay.SinglyLinkList.Node;
public class SinglyLink {
    static Node head;
    static int length;
    static class Node
    {
    	int data;
    	Node next;
    	
    	Node(int d)
    	{
    		int data=d;
    		next=null;
    	}
    }
    public static void Insert(int v)
    {
    	Node tmp=new Node(v);
    	tmp.data=v;
    
    	tmp.next=head;
    	head=tmp;
    	}
    public static void Display()
    {
    	//Node tmp=new Node(v);
    	
    	Node q=head;
    	while(q!=null)
    	{
    		System.out.print(q.data+" ");
    		q=q.next;
    	}
    	System.out.println();
    	
    	
    }
    public static void Last(int v)
    {
    	Node tmp=new Node(v);
    	tmp.data=v;
    	Node q=head;
    	while(q.next!=null)
    	{
    		q=q.next;
    	}
    	q.next=tmp;
    	tmp.next=null;	
    }
    
    public static void Position(int v,int pos)
    {
    	Node tmp=new Node(v);
    	tmp.data=v;
    	int count=1;
    	Node q=head;
//    	while(count<pos-1)
//    	{
//    		q=q.next;
//    		count++;
//    	}
//    	Node current=q.next;
//    	tmp.next=current;
//    	q.next=tmp;
    	for(int i=0;i<pos-1;i++)
    	{
    		q=q.next;
    	}
    	tmp.next=q.next;
    	q.next=tmp;
    }
    public static void DeleteFirst()
    {
    	Node tmp=head;
    	head=head.next;
    	tmp=null;
    }
    public static void DeleteLast()
    {
//    	Node tmp;
//    	Node q=head;
//    
//    	while(q.next.next!=null)
//    	{
//    		q=q.next;
//    		
//    	}
//    	q.next=null;

    	Node last=head;
    	Node privousToLast=null;
    	while(last.next!=null)
    	{
    		privousToLast=last;
    		last=last.next;
    	}
    	privousToLast.next=null;
    }
    public static void reverse()
    {
    	//if(head==null) {System.out.println("no elements");}
    	
    	Node current=head;
    	Node prevois=null;
    	Node next=null;
    	
    	while(current!=null)
    	{
    		next=current.next;
    		current.next=prevois;
    		prevois=current;
    		current=next;
    		
    	}
    	System.out.println(prevois);
    	Node q=head;
    	while(q!=null)
    	{
    		System.out.print(q.data+" ");
    		q=q.next;
    	}
    }
    public static void DeletePos(int pos)
    {
//    	Node temp=head;
//    	if(head==null)
//    	{
//    		System.out.println("List is eampty");
//    	}
//    	else
//    	{
//    		Node q=head;
//    	
//    		for(int i=0;i<pos-1;i++)
//    		{
//    			q=q.next;
//    		}
//    		q.next=q.next.next;
//    	}

    	if(pos==1)
    	{
    		Node tmp=head;
    		head=head.next;
    		tmp.next=null;
    	}
    	else
    	{
        	Node privous=head;
        	int count=1;
        	while(count<pos-1)
        	{
        		privous=privous.next;
        		count++;
        	}
        	Node current=privous.next;
        	privous.next=current.next;
        	current.next=null;	
    		
    	}
    }
    public static void Length()
    {
    	Node current=head;
    	length=0;
    	
    	while(current!=null)
    	{
    		length++;
    		current=current.next;
    	}
    	System.out.println("Length is "+length);
    }
    
    public static void Duplicate()
    {
    	Node current=head;
    
    	
    	if(head==null)
    	{
    		System.out.println("There  is no node");
    	}
    	
//    	while(current!=null && current.next!=null)
//    	{
//    		for(int i=0;i<length-1;i++)
//    		{
//    			for(int j=i+1;j<length-1;j++)
//    			{
//    				System.out.println("current data "+current.data);
//    				
//    			}
//    		}
    	while(current!=null && current.next!=null)
    	       {
    	    	   for(int i=0;i<length-1;i++)
    	       		{
    	       			for(int j=i+1;j<length-1;j++)
    	       			{
    	       				if(current.data==current.next.data)
    	       					
    	       				{
    	       					current.next=current.next.next;
    	       				}
    	       				else
    	       				{
    	       					current=current.next;
    	       				}
    	       				
    	       			}
    	       		}
    	       }
//    		if(current.data==current.next.data)
//    		{
//    			current.next=current.next.next;
//    		}
//    		
//    		else
//    		{
//    			current=current.next;
//    		}
    		
    //	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	
		 
		    Insert(1); 
		    Insert(1);
		    Insert(2);
		    Insert(3);
		   // Insert(2);
		    Last(4);
		    Last(4);
		    Display();
		   Length();
			Duplicate();
			Display();
	
		
			
			
	}

}
