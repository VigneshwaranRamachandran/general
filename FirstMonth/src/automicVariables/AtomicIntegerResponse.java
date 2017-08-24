package automicVariables;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;

public class AtomicIntegerResponse extends Thread {
//	static RestClient restClient = RestClient.builder(
//		       new HttpHost("localhost", 9200, "http"),
//		       new HttpHost("localhost", 9205, "http")).build();
//	static org.elasticsearch.client.Response response; 
	public static AtomicInteger source = new AtomicInteger(0);
	
	public static Object get(String url) throws IOException {
		
		Thread t; 
		
		for(int i=0;i<5;i++){
			t= new AtomicIntegerResponse();
			t.start();
			}
		return new String("sucess");
		
		
		
//		response = restClient.performRequest("GET",url);
//	return response;	
	}
	public void run() {
		source.incrementAndGet();
		System.out.println("hit count : "+source.get()+" using atomic interger");
	}
	

}
