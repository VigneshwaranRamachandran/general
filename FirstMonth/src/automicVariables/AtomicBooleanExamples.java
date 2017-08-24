package automicVariables;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanExamples {

	public static void main(String[] args) {
		AtomicBoolean atomicBoolean = new AtomicBoolean(true);
		
		// get a boolean value
		
		boolean value = atomicBoolean.get();
		System.out.println("boolean value: "+value);
		System.out.println("automic boolean value: "+atomicBoolean);
		
		
		//set a boolean value
		
		atomicBoolean.set(false);
		System.out.println("automic boolean value afeter set: "+atomicBoolean);
	
		
		//Swapping a boolean value
		
		boolean oldValue = atomicBoolean.getAndSet(true);
		boolean oldValue1 = atomicBoolean.getAndSet(true);
		System.out.println("return old boolean value: "+oldValue);
		System.out.println("but set automic boolean as new value: "+atomicBoolean);
		System.out.println("return 2nd time old boolean value: "+oldValue1);
		System.out.println("but set automic boolean as new value: "+atomicBoolean);
		
		//if current value is equal to the expected value, a new value can be set on the AtomicBoolean and return true
		
		boolean expectedValue = true;
		boolean newValue      = false;
		System.out.println("current automic boolean vlaue is: "+atomicBoolean);
		boolean wasNewValueSet=atomicBoolean.compareAndSet(expectedValue, newValue);
		System.out.println("condition satisfied then return: "+ wasNewValueSet+" and new atomicboolean value is: "+atomicBoolean);
		
		boolean expectedValue1 = true;
		boolean newValue1      = false;
		System.out.println("current automic boolean vlaue is: "+atomicBoolean);
		boolean wasNewValueSet1=atomicBoolean.compareAndSet(expectedValue1, newValue1);
		System.out.println("condition not satisfied then return: "+ wasNewValueSet1+" and new atomicboolean value is: "+atomicBoolean);
	}

}
