package firstweek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SessionAtomicIntCheck {

	
	public static List l1 =new ArrayList();
	
	public static void main(String[] args) {
		
	new SessionAtomicIntCheck().scriptInput();
		
	}
	
	
	public void scriptInput(){
		for(int i=0;i<5;i++){
			atomicClass(i);
		}
		for(int i=0;i<5;i++){
			atomicClass(2);
		}
	}


	private void atomicClass(int i) {
		
			if(i==0)
			{
				AtomicInteger ai=new AtomicInteger(0);
				ai.incrementAndGet();
				l1.add(i,ai);
				
			}
			else{
				AtomicInteger a=(AtomicInteger) l1.get(i);
				a.incrementAndGet();
				System.out.println(a);
			}
			
			}
		

	
	
}