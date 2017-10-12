package com.basics;

public class Codeboard {
	static int p=0;
public static void main(String[] args) {
	int a[] ={5,4,6,7,8,8,9,2};
	for(int i=a.length-1;i >=1;i--){
		int k=i-1;
		if(i%2==0){
			p=a[k]+a[k-1];
			a[i]=p;
			p=0;
		}
		else{
			a[i]=a[i];
		}
	}
	for(int i=0;i<a.length;i++){
	System.out.print(a[i]+" ");
	}
}
}
