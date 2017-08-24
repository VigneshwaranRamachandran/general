package checkingContention;

import org.springframework.beans.factory.annotation.Autowired;

public class MainClass extends Thread {
	@Autowired
	private CallingClass cc = new CallingClass();

	public static void main(String[] args) {
		for (int i = 0; i <100000; i++) {
			Thread t = new MainClass();
			t.start();
		}
		try {
			Thread.sleep(30000);
			new CallingClass().display();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		cc.getResponse();
	}
}
