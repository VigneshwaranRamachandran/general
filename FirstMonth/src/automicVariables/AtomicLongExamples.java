package automicVariables;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongExamples {

	public static void main(String[] args) {
		AtomicLong atomicLong = new AtomicLong(123);
		// get a long value
		long theValue = atomicLong.get();
		System.out.println("Integer value is: "+theValue);
		System.out.println("automic interger value is:"+atomicLong);

		
		//set a atomic long value
		atomicLong.set(234);
		System.out.println("after set the value: "+atomicLong);
		
		//if current value is equal to the expected value, a new value can be set on the AtomicLong and return true
		int expectedValue = 123;
		int newValue      = 234;
		atomicLong.compareAndSet(expectedValue, newValue);
		System.out.println("new value is: "+atomicLong);
		
		int expectedValue1= 123;
		int newValue1      = 234;
		atomicLong.compareAndSet(expectedValue1, newValue1);
		System.out.println("new value is: "+atomicLong);
		
		//getAndAdd  and AddAndGet its also possible for negetive values
		System.out.println(atomicLong.getAndAdd(10));//post increment 
		System.out.println(atomicLong.addAndGet(10));//preincrement
		
		//getAndIncrement and AddAndIncrement
		System.out.println(atomicLong.getAndIncrement());//post increment by one
		System.out.println(atomicLong.incrementAndGet());//pre increment by one
		
		
		//getAndDecrement and DecrementAndGet
		System.out.println(atomicLong.getAndDecrement());//post decrement by one
		System.out.println(atomicLong.decrementAndGet());//pre decrement by one
	}

}
