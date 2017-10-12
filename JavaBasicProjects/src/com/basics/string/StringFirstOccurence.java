package com.basics.string;

public class StringFirstOccurence {
	static int last=0;
	static int first=0;
public static void main(String[] args) {
	String s="google google panni paathen google ulagathula";
	//first and last occurence of string
	System.out.println("first occurence: "+s.indexOf("google"));
	System.out.println("second occurence:"+s.lastIndexOf("google"));
	
	String s1="google";
	String s2[]=s.split(" ");
	for(int i=0;i<s2.length;i++){
		if(s2[i].equals(s1)){
			for(int j=i-1;j>=0;j--){
				String res=s2[j];
				int y=res.length();
				first=first+y+1;
			}
			System.out.println("first occurence:"+first);
			break;
		}
	}
	for(int i=s2.length-1;i>0;i--){
		if(s2[i].equals(s1)){
			for(int j=i-1;j>=0;j--){
				String res=s2[j];
				int y=res.length();
				last=last+y+1;
			}
			System.out.println("last occurence: "+last);
			break;
		}
	}
	boolean flag = false;
	new StringFirstOccurence().foo(flag, flag);
}
public void foo( boolean a, boolean b)
{ 
    if( a ) 
    {
        System.out.println("A"); /* Line 5 */
    } 
    else if(a && b) /* Line 7 */
    { 
        System.out.println( "A && B"); 
    } 
    else /* Line 11 */
    { 
        if ( !b ) 
        {
            System.out.println(!b) ;
        } 
        else 
        {
            System.out.println( "ELSE" ) ; 
        } 
    } 
}

 
}
