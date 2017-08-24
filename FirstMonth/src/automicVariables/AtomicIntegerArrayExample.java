package automicVariables;

import java.util.concurrent.atomic.AtomicIntegerArray;


public class AtomicIntegerArrayExample {

	public static void main(String[] args) {
		//two types of creating a AtomicIntegerArray
		
		AtomicIntegerArray atomicIntegerArray1 = new AtomicIntegerArray(10);
		System.out.println(atomicIntegerArray1);
		
		int[] ints = new int[10];

		ints[5] = 123;

		AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(ints);

		
		// get a integer value
		int theValue = atomicIntegerArray.get(5);
		System.out.println("Integer value is: "+theValue);
		System.out.println("automic interger value is:"+atomicIntegerArray);

		
		//set a atomic integer value
		atomicIntegerArray.set(5,234);
		System.out.println("after set the value: "+atomicIntegerArray);
		
		//if current value is equal to the expected value, a new value can be set on the atomicIntegerArray and return true
		int expectedValue = 123;
		int newValue      = 234;
		atomicIntegerArray.compareAndSet(5,expectedValue, newValue);
		System.out.println("new value is: "+atomicIntegerArray);
		
		int expectedValue1= 123;
		int newValue1      = 234;
		atomicIntegerArray.compareAndSet(5,expectedValue1, newValue1);
		System.out.println("new value is: "+atomicIntegerArray);
		
		//getAndAdd  and AddAndGet its also possible for negetive values
		System.out.println(atomicIntegerArray.getAndAdd(5,10));//post increment 
		System.out.println(atomicIntegerArray.addAndGet(5,10));//preincrement
		
		//getAndIncrement and AddAndIncrement
		System.out.println(atomicIntegerArray.getAndIncrement(5));//post increment by one
		System.out.println(atomicIntegerArray.incrementAndGet(5));//pre increment by one
		
		
		//getAndDecrement and DecrementAndGet
		System.out.println(atomicIntegerArray.getAndDecrement(5));//post decrement by one
		System.out.println(atomicIntegerArray.decrementAndGet(5));//pre decrement by one
	}

}
