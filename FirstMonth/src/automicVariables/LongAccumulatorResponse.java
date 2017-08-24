package automicVariables;

import java.io.IOException;
import java.util.concurrent.atomic.LongAccumulator;
public class LongAccumulatorResponse extends Thread {

	public static LongAccumulator source1= new LongAccumulator(Long::sum, 0);
	
	public static void main(String[] args)  throws IOException {
	
Thread t; 
		
		for(int i=0;i<5;i++){
			t= new LongAccumulatorResponse();
			t.start();
			}
		
	}
	public void run() {
		source1.accumulate(1);
		System.out.println("hit count : "+source1.get()+" using LongAccumulator");
	}
	
}