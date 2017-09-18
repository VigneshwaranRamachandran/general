package com.basics;

public class Singleton {
	private static Singleton myObj;
    private Singleton(){
         System.out.println("first");
    }
    public static Singleton suma(){
      if(myObj == null){
            myObj = new Singleton();
            return myObj;
       }
      else{
       System.out.println("second time");
       return myObj;
    }
     
    }
    public void getSomeThing(){
        // do something here
        System.out.println("I am here....");
    }
     
    public static void main(String a[]){
    	for(int i=0;i<3;i++){
    	Singleton st = Singleton.suma();
    	 st.getSomeThing();
    	}
       
    }
}
