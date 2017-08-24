package checkingContention;

import java.util.Date;
import java.util.concurrent.atomic.LongAdder;

public class LongAdderResponse implements Responses{

	public static LongAdder lAdd =new LongAdder(); 
	
	static Date d1;

	@Override
	public ResponsePogo getResponse() {
		lAdd.increment(); //return type is void
		ResponsePogo rp = new ResponsePogo();
		if (d1 == null) {
			d1 = new Date();
		}
		Date d2 = new Date();
		rp.setCount(lAdd.intValue());
		rp.setStartTime(d1);
		rp.setEndTime(d2);
		return rp;
	}
}
