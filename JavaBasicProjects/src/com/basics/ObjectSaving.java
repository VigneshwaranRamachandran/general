package com.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectSaving {
static List<ObjectSavingPojo> l1 = new ArrayList<ObjectSavingPojo>();

public static void main(String[] args) {
	 ObjectSavingPojo o;
	Scanner sc1=new Scanner(System.in);
	for(int j=0;j<2;j++){
	System.out.println("enter id value:");
	int i=sc1.nextInt();
	System.out.println("enter name :");
	String s=sc1.next();
	System.out.println("enter address:");
	String s1 = sc1.next();
	o = new ObjectSavingPojo();
	o.setId(i);
	o.setName(s);
	o.setAddress(s1);
	l1.add(o);
	}
	display();
}
private static void display() {
	for(ObjectSavingPojo ob:l1){
		System.out.println(ob.getId());
		System.out.println(ob.getName());
		System.out.println(ob.getAddress());
	}
	
}
}
