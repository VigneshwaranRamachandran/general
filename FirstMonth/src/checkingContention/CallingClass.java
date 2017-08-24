package checkingContention;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
public class CallingClass {
	@Autowired
	private AtomicIntegerResponse aint = new AtomicIntegerResponse();
	@Autowired
	private AtomicLongResponse along = new AtomicLongResponse();
	@Autowired
	private DoubleAccumulatorResponse dacc = new DoubleAccumulatorResponse();
	@Autowired
	private DoubleAdderResponse dadd = new DoubleAdderResponse();
	@Autowired
	private LongAccumulatorResponse lacc = new LongAccumulatorResponse();
	@Autowired
	private LongAdderResponse ladd = new LongAdderResponse();

	static List<ResponsePogo> l1 = new ArrayList<ResponsePogo>();
	static List<ResponsePogo> l2 = new ArrayList<ResponsePogo>();
	static List<ResponsePogo> l3 = new ArrayList<ResponsePogo>();
	static List<ResponsePogo> l4 = new ArrayList<ResponsePogo>();
	static List<ResponsePogo> l5 = new ArrayList<ResponsePogo>();
	static List<ResponsePogo> l6 = new ArrayList<ResponsePogo>();

	public void getResponse() {

		ResponsePogo r1 = aint.getResponse();
		l1.add(r1);
		ResponsePogo r2 = along.getResponse();
		l2.add(r2);
		ResponsePogo r3 = dacc.getResponse();
		l3.add(r3);
		ResponsePogo r4 = dadd.getResponse();
		l4.add(r4);
		ResponsePogo r5 = lacc.getResponse();
		l5.add(r5);
		ResponsePogo r6 = ladd.getResponse();
		l6.add(r6);

	}

	public void display() {
		System.out.println("SOLLUTION SET : 1 - ATOMIC INTEGER");
		System.out.println("Start Time : " + l1.get(0).startTime);
		System.out.println("End Time : " + l1.get(l1.size()-1).endTime);
		System.out.println("Start Count :"+l1.get(0).count);
		System.out.println("End Count :"+l1.get(l1.size()-1).count);
		System.out.println("************************");
		System.out.println("ATOMIC lONG :");
		System.out.println("Start Time : " + l2.get(0).startTime);
		System.out.println("End Time : " + l2.get(l2.size()-1).endTime);
		System.out.println("Start Count :"+l2.get(0).count);
		System.out.println("End Count :"+l2.get(l2.size()-1).count);
		System.out.println("************************");
		System.out.println("SOLLUTION SET : 2 - DOUBLE ACCUMULATOR :");
		System.out.println("Start Time : " + l3.get(0).startTime);
		System.out.println("End Time : " + l3.get(l3.size()-1).endTime);
		System.out.println("Start Count :"+l3.get(0).count);
		System.out.println("End Count :"+l3.get(l3.size()-1).count);
		System.out.println("************************");
		System.out.println("LONG ACCUMULATOR :");
		System.out.println("Start Time : " + l5.get(0).startTime);
		System.out.println("End Time : " + l5.get(l5.size()-1).endTime);
		System.out.println("Start Count :"+l5.get(0).count);
		System.out.println("End Count :"+l5.get(l5.size()-1).count);
		System.out.println("************************");
		System.out.println("SOLLUTION SET : 3 - DOUBLE ADDER :");
		System.out.println("start Time : " + l4.get(0).startTime);
		System.out.println("End Time : " + l4.get(l4.size()-1).endTime);
		System.out.println("Start Count :"+l4.get(0).count);
		System.out.println("End Count :"+l4.get(l4.size()-1).count);
		System.out.println("************************");
		System.out.println("LONG ADDER :");
		System.out.println("Start Time : " + l6.get(0).startTime);
		System.out.println("End Time : " + l6.get(l6.size()-1).endTime);
		System.out.println("Start Count :"+l6.get(0).count);
		System.out.println("End Count :"+l6.get(l6.size()-1).count);
	}

}
