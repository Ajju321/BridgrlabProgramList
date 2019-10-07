package com.codewithajay;
public class SinglyLinkList {
	static Node head;
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
	public static void AtBegining(int v)
	{
		Node  tmp=  new Node(v);
		tmp.data=v;
		tmp.next=head;
		head=tmp;
	}
	
	public static void Print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}
		System.out.println();
	}

	public static void AtLast(int n)
	{
		Node q=new Node(n);
		q.data=n;
		Node p=head;
		
		while(p.next!=null)
		{
			p=p.next;
		}
		p.next=q;
		q.next=null;
	}
	
	public static void AtPosition(int x,int p)
	{
		Node q=new Node(x);
		q.data=x;
		Node r=head;
		for(int i=0;i<p-1;i++)
		{
			r=r.next;
		}
		q.next=r.next;
		r.next=q;
		
	}
	public static void LastDelete()
	{
	Node q=head;
	if(head==null)
	{
	System.out.println("list is empty");
	}
	else
	{
		while(q.next.next!=null)
		{
			q=q.next;
		}
	    q.next=null; 
	}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AtBegining(10);
		AtBegining(20);
		AtBegining(30);
		AtBegining(40);
		AtBegining(50);
		AtBegining(60);
		
		Print();
		AtLast(90);
		Print();	
		AtPosition(12,1);
		Print();	
		LastDelete();
		Print();
	}

}
