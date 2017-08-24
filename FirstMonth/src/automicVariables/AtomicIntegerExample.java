package automicVariables;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger(123);
		// get a integer value
		int theValue = atomicInteger.get();
		System.out.println("Integer value is: "+theValue);
		System.out.println("automic interger value is:"+atomicInteger);

		
		//set a atomic integer value
		atomicInteger.set(234);
		System.out.println("after set the value: "+atomicInteger);
		
		//if current value is equal to the expected value, a new value can be set on the AtomicInteger and return true
		int expectedValue = 123;
		int newValue      = 234;
		atomicInteger.compareAndSet(expectedValue, newValue);
		System.out.println("new value is: "+atomicInteger);
		
		int expectedValue1= 123;
		int newValue1      = 234;
		atomicInteger.compareAndSet(expectedValue1, newValue1);
		System.out.println("new value is: "+atomicInteger);
		
		//getAndAdd  and AddAndGet its also possible for negetive values
		System.out.println(atomicInteger.getAndAdd(10));//post increment 
		System.out.println(atomicInteger.addAndGet(10));//preincrement
		
		//getAndIncrement and AddAndIncrement
		System.out.println(atomicInteger.getAndIncrement());//post increment by one
		System.out.println(atomicInteger.incrementAndGet());//pre increment by one
		
		
		//getAndDecrement and DecrementAndGet
		System.out.println(atomicInteger.getAndDecrement());//post decrement by one
		System.out.println(atomicInteger.decrementAndGet());//pre decrement by one
	}

}
