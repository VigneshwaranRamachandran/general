package automicVariables;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;

public class ElasticSearchAtomic extends Thread {
	
		RestClient restClient = RestClient.builder(
			       new HttpHost("localhost", 9200, "http"),
			       new HttpHost("localhost", 9205, "http")).build();
		org.elasticsearch.client.Response response; 
	
	public static AtomicInteger source = new AtomicInteger(0);
	public static AtomicInteger source1 = new AtomicInteger(4);
	public void run() {
		
		System.out.println(ElasticSearchAtomic.source.addAndGet(1));
		try {
				System.out.println(restClient.performRequest("GET","/documents/product/1043"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		

	}


	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			Thread t = new ElasticSearchAtomic();
			Thread t1 = new ElasticSearchAtomic();
			t.start();
			t1.start();
			try {
				System.out.println("-----x------");
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
