/* 
 * @author vignesh ramachandran
 */



package automicVariables;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferrenceExamples  {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		//two types and six methods to create a AtomicReference
		AtomicReference atomicReference1 = new AtomicReference();
		System.out.println(atomicReference1);
		
		String initialReference1 = "the initially referenced string";
		AtomicReference atomicReference2 = new AtomicReference(initialReference1);
		String reference2 = (String) atomicReference2.get();
		System.out.println(reference2);
		
		AtomicReference atomicReference3= new AtomicReference("first value referenced");
		String reference3 = (String) atomicReference3.get();
		System.out.println(reference3);
		
		
		AtomicReference<String> atomicReference4 =new AtomicReference<String>();
		System.out.println(atomicReference4);
		
		String initialReference = "the initially referenced string";
		AtomicReference<String> atomicReference5 =new AtomicReference<String>(initialReference);
		String reference5 = atomicReference5.get();
		System.out.println(reference5);
		
		AtomicReference<String> atomicReference6 = new AtomicReference<String>("first value referenced");
		String reference6 = atomicReference6.get();
		System.out.println(reference6);
		
		
		//set a value,there is no difference between typed and untyped methods
		atomicReference1.set("New object referenced 1");
		atomicReference2.set("New object referenced 2");
		atomicReference3.set("New object referenced 3");
		atomicReference4.set("New object referenced 4");
		atomicReference5.set("New object referenced 5");
		atomicReference6.set("New object referenced 6");
		System.out.println(atomicReference1+"--"+atomicReference2+"--"+atomicReference3+"--"+atomicReference4+"--"+atomicReference5+"--"+atomicReference6);
		
		//compareAndSet
		atomicReference4.compareAndSet(initialReference, "anythink");
		System.out.println(atomicReference4);
		
		String reference7 = (String) atomicReference2.get();
		
		System.out.println("same string value compare to atomicvariable expected will be true: "+(reference7.equals(atomicReference2)));
		
		System.out.println("atomicvariable compare to same atomicvariable expected will be true: "+(atomicReference2.equals(atomicReference2)));
		
		//compareAndSet is not for comparing automicvariables
		System.out.println(atomicReference2.compareAndSet(atomicReference2, atomicReference4));
		System.out.println(atomicReference2);
		System.out.println(atomicReference2.toString());
		System.out.println("check "+atomicReference2.compareAndSet(atomicReference2.toString(), atomicReference4));
		System.out.println(atomicReference2.toString().equals(atomicReference2.toString()));
		
		//line number 52 having false so the correct method to compare string value to atomicvariable is compareAndSet method
		System.out.println(atomicReference2.compareAndSet(reference7, atomicReference4));
		
		System.out.println((atomicReference2.equals(atomicReference2)));
		System.out.println((atomicReference2.equals(atomicReference4)));
		
		System.out.println(atomicReference2);
		System.out.println(atomicReference2.toString());
		System.out.println("check "+atomicReference2.compareAndSet(atomicReference2.toString(), atomicReference4));
		System.out.println(atomicReference2.toString().equals(atomicReference2.toString()));
		
		
		
	}

}
