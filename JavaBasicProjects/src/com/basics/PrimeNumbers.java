package com.basics;

public class PrimeNumbers {
	public static void main(String[] args) {
		giveNumber();
		first100Nmber();	
	
	}

	private static void first100Nmber() {
		//int flag=0;
		for(int i=1;i<100;i++){
			int flag = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
//				else{
//					flag=0;
//				}
			}
			if (flag == 0){
				System.out.println(i+"  : Number is prime");
			}
		}
		
	}

	private static void giveNumber() {
		int i, m = 0, flag = 0;
		int n = 17;// it is the number to be checked
		m = n / 2;
		for (i = 2; i <= m; i++) {
			if (n % i == 0) {
				System.out.println("Number is not prime");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Number is prime");
		
	}
}
