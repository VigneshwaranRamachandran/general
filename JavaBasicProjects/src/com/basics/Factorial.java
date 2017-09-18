package com.basics;

public class Factorial {
	static int sum =1;
public static void main(String[] args) {
	withOut();
	withRecursive(4);
	System.out.println(sum);
}

private static void withRecursive(int j) {

	if(j>1){
		sum=sum*(j);
		withRecursive(j-1);
	}
	
}

private static void withOut() {
	int n=4;
	 int sum =1;
	for(int i=n;i>1;i--){
		sum=sum*(i);
	}
	System.out.println(sum);
	
}
}
