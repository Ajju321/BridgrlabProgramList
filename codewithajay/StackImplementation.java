package com.codewithajay;

public class StackImplementation {
 static final int max=10;
 static int top,x;
 int a[]=new int[max];
 
 boolean isEmpty()
 {
	 
		 return (top<0);
	 
 }
 StackImplementation()
 {
	 top=-1;
 }
 boolean push(int x)
 {
	 if(top>=max-1)
	 {
		 System.out.println("stakc is overflow");
		 return false;
	 }
	 else
	 {
		 a[++top]=x;
		 System.out.print(x + " ");
		 return true;
	 }
	 
 }
 
int pop(int x)
 {
	 if(top==-1)
	 {
		 System.out.println("Stack is underflow ");
		 return 0;
	 }
	 else
	 {
		x=a[top--];
		return x;
	 }
 }
int peek()
{
    if(top<0)
    {
    	System.out.println("stack is underflow ");
    	return 0;
    }
    else
    {
    int x = a[top];
    return x;
    }
}
void display()
{
   for(int i=0;i<top;i++)
   {
	   System.out.print(a[i] + " ");
   }
}
int search(int x)
{
if(top==-1)
{
   System.out.println("there is no element to search ");
   return x;
}
   for(int i=0;i<top;i++)
   { 
   if(a[i]==x)
    {
	   System.out.println("element found at "+i+" position"); return x;
	}
   }
return 0;
}
void reversestack()
{
	
    for(int i=top;i>=0;i--)
    {
    	System.out.print(a[i]+" ");
    }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplementation st=new StackImplementation();
	    st.push(10);   
	    st.push(20);   
	    st.push(30);   
	    st.push(40);   
	    st.push(50);   
	    st.push(60);   
	    st.push(70);   
	    st.push(80);   
	    st.push(90);   
	    st.push(100);   
	    
	
	 
		 //st.display();
		
		//st.search(40);
		System.out.println("\nReverse the stack");
		st.reversestack();
	}

}
