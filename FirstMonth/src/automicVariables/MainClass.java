package automicVariables;

import java.io.IOException;

public class MainClass {
@SuppressWarnings("static-access")
public static void main(String[] args) {

	try {
		new AtomicIntegerResponse().get("111");
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
