package automicVariables;


import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArrayExamples {

	public static void main(String[] args) {
		//two types of creating an AtomicLongArray
		AtomicLongArray atomicLongArray1 = new AtomicLongArray(10);
		System.out.println(atomicLongArray1);
		
		long[] longs = new long[10];

		longs[5] = 123;

		AtomicLongArray atomicLongArray= new AtomicLongArray(longs);
		// get a long value
		long theValue = atomicLongArray.get(5);
		System.out.println("Integer value is: "+theValue);
		System.out.println("automic interger value is:"+atomicLongArray);

		
		//set a atomic long value
		atomicLongArray.set(5,234);
		System.out.println("after set the value: "+atomicLongArray);
		
		//if current value is equal to the expected value, a new value can be set on the atomicLongArray and return true
		int expectedValue = 123;
		int newValue      = 234;
		atomicLongArray.compareAndSet(5,expectedValue, newValue);
		System.out.println("new value is: "+atomicLongArray);
		
		int expectedValue1= 123;
		int newValue1      = 234;
		atomicLongArray.compareAndSet(5,expectedValue1, newValue1);
		System.out.println("new value is: "+atomicLongArray);
		
		//getAndAdd  and AddAndGet its also possible for negetive values
		System.out.println(atomicLongArray.getAndAdd(5,10));//post increment 
		System.out.println(atomicLongArray.addAndGet(5,10));//preincrement
		
		//getAndIncrement and AddAndIncrement
		System.out.println(atomicLongArray.getAndIncrement(5));//post increment by one
		System.out.println(atomicLongArray.incrementAndGet(5));//pre increment by one
		
		
		//getAndDecrement and DecrementAndGet
		System.out.println(atomicLongArray.getAndDecrement(5));//post decrement by one
		System.out.println(atomicLongArray.decrementAndGet(5));//pre decrement by one
	}

}
