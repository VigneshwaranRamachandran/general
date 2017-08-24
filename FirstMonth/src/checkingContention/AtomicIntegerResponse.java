package checkingContention;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerResponse implements Responses {
	public static AtomicInteger aInt = new AtomicInteger(0);
	static Date d1;

	@Override
	public ResponsePogo getResponse() {
		
		ResponsePogo rp = new ResponsePogo();
		rp.setCount(aInt.incrementAndGet());
		if (d1 == null) {
			d1 = new Date();
		}
		Date d2 = new Date();
		
		rp.setStartTime(d1);
		rp.setEndTime(d2);
		return rp;
	}
}
