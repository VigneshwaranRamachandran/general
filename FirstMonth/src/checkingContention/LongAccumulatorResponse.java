package checkingContention;

import java.util.Date;
import java.util.concurrent.atomic.LongAccumulator;

public class LongAccumulatorResponse implements Responses{

	public static LongAccumulator lAccu= new LongAccumulator(Long::sum, 0);
	
	static Date d1;

	@Override
	public ResponsePogo getResponse() {
		lAccu.accumulate(1); //return type is void
		ResponsePogo rp = new ResponsePogo();
		if (d1 == null) {
			d1 = new Date();
		}
		Date d2 = new Date();
		rp.setCount((int)lAccu.get());
		rp.setStartTime(d1);
		rp.setEndTime(d2);
		return rp;
	}
}
