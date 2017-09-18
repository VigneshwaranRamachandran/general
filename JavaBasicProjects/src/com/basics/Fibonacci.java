package com.basics;

public class Fibonacci {
	static int n1=0,n2=1,n3=0;
	public static void main(String args[])  
	{	
		withOut();
		
		System.out.println();
		System.out.print(n1+" "+n2);
		
		withRecursive(5-2);
	}

	private static void withRecursive(int j) {
		if(j>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         withRecursive(j-1);    
	     }    
		
	}

	private static void withOut() {
		{    
			 int n1=0,n2=1,n3,i,count=10;    
			 System.out.print(n1+" "+n2);//printing 0 and 1    
			    
			 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
			 {    
			  n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3;    
			 }    
			  
			}
	}
}
