package com.basics;
 interface Run{
	 void classPass();
}
 abstract class MainClass implements Run{
	
	public abstract void classPass();
			
}
  class class2 extends MainClass{
	  public void classPass(){
			System.out.println("sucess at class 2");
		}
 }
public class AbstractClassAndInterface extends class2{
public static void main(String[] args) {
	AbstractClassAndInterface mc = new AbstractClassAndInterface();
	mc.classPass();
	
}
}