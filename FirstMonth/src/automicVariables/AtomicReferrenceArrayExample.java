package automicVariables;

import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.DoubleAccumulator;

public class AtomicReferrenceArrayExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//type of creating a AtomicReferrenceArray
		AtomicReferenceArray array = new AtomicReferenceArray(10);
		System.out.println(array);
		
		Object[] source = new Object[10];

		source[5] = "Some string";

		AtomicReferenceArray array2 = new AtomicReferenceArray(source);
		System.out.println(array2);

		String[] source1 = new String[10];

		source1[5] = "Some string";

		AtomicReferenceArray<String> array3 =   new AtomicReferenceArray<String>(source1);
		System.out.println(array3);
		String element = array3.get(5);
		System.out.println(element);
		array3.set(5, "another object");
		System.out.println(array3);
		array3.compareAndSet(5, source1[5], "sadf");
		System.out.println(array3.get(5));
		array3.compareAndSet(5, array3.get(5), "sadf");
		System.out.println(array3.get(5));
//DoubleAccumulator m =new DoubleAccumulator(null, 0);
		
		}

}
