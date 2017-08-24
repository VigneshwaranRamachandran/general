package firstweek;

import java.util.concurrent.atomic.AtomicInteger;
//import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongExample extends Thread {
	public static AtomicInteger source = new AtomicInteger(0);
	public static int i;

//	public void start() {
//		super.start();
//		System.out.println(AtomicLongExample.source.addAndGet(1));
//		System.out.println(Thread.currentThread().getName());
//	
//	}

	public void run() {
	 i=AtomicLongExample.source.get();
	 i++;
	 System.out.println(i);
		System.out.println(AtomicLongExample.source.addAndGet(1));
		System.out.println(Thread.currentThread().getName());
		System.out.println("Requested thread was hitted into the server And thread count is:"+AtomicLongExample.source
				);

	}

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			Thread t = new AtomicLongExample();
			Thread t1 = new AtomicLongExample();
			t1.setName("second"+i); 
			t.setName("first"+i); 
			t.start();
			t1.start();

			try {
				System.out.println("-----x------");
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
