package checkingContention;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongResponse implements Responses {

	static AtomicLong aLon = new AtomicLong(0);
	static Date d1;

	@Override
	public ResponsePogo getResponse() {
		
		ResponsePogo rp = new ResponsePogo();
		if (d1 == null) {
			d1 = new Date();
		}
		Date d2 = new Date();
		rp.setCount((int)aLon.incrementAndGet());
		rp.setStartTime(d1);
		rp.setEndTime(d2);
		return rp;
	}
}
