package com.basics;

public class Palindrome {
public static void main(String[] args) {
	int r=0,sum=0,n=654;
	int temp = n;
	while(n>0){
		r=r%10;
		sum = (sum*10)+r;
		n=n/10;
	}
	if(temp==n)
		System.out.println("palindrome");
	System.out.println("not a palindrome");
}
}
