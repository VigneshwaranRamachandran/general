package checkingContention;

import java.util.Date;
import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdderResponse implements Responses {

	public static DoubleAdder dAdd =new DoubleAdder(); 
	
	static Date d1;

	@Override
	public ResponsePogo getResponse() {
		dAdd.add(1);//return type is void
		ResponsePogo rp = new ResponsePogo();
		if (d1 == null) {
			d1 = new Date();
		}
		Date d2 = new Date();
		rp.setCount(dAdd.intValue());
		rp.setStartTime(d1);
		rp.setEndTime(d2);
		return rp;
	}
}
