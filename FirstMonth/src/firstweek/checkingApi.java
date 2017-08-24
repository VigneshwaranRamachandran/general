package firstweek;

import api.ApiTest;


public class checkingApi {
public static void main(String[] args) {
	int i =ApiTest.count(1);
	String s= ApiTest.value("this is testing the sample api");
System.out.println(i+":"+s);
}
}
