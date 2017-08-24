
/* 
 * @author vignesh ramachandran
 */

package checkingContention;

import java.util.concurrent.atomic.AtomicInteger;
//import java.util.concurrent.atomic.AtomicLong;

public class Task1 extends Thread {
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 200; i++) {
			Thread t = new Task1();
			t.start();
			}

	}
	
	public static AtomicInteger source = new AtomicInteger(0);
	public static int i;

	// public void start() {
	// super.start();
	// System.out.println(AtomicLongExample.source.addAndGet(1));
	// System.out.println(Thread.currentThread().getName());
	//
	// }

	public void run() {
		// i=Task1.source.get();
		// i++;
		// System.out.println(i);
		source.incrementAndGet();
		if(source.get()<10){
	System.out.println("Requested thread was hitted into the server And thread count is:" + source);
		}
		else{
			System.out.println(Thread.currentThread());
			System.out.println("limit 10 request exist");
			System.out.println("count : "+source);
			System.exit(0);
		}
	}

	

}
