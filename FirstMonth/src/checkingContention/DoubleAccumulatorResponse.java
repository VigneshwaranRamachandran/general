package checkingContention;

import java.util.Date;
import java.util.concurrent.atomic.DoubleAccumulator;


public class DoubleAccumulatorResponse implements Responses{

	public static DoubleAccumulator dAccu= new DoubleAccumulator(Double::sum, 0);
	static Date d1;

	@Override
	public ResponsePogo getResponse() {
		dAccu.accumulate(1);//return type is void 
		ResponsePogo rp = new ResponsePogo();
		if (d1 == null) {
			d1 = new Date();
		}
		Date d2 = new Date();
		rp.setCount((int)dAccu.get());
		rp.setStartTime(d1);
		rp.setEndTime(d2);
		return rp;
	}
}
