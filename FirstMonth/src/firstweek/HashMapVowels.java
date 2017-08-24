package firstweek;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapVowels {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("a", 0);
		m.put("e", 0);
		m.put("i", 0);
		m.put("o", 0);
		m.put("u", 0);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String s1 = Character.toString(ch[i]);
			for (Map.Entry<String, Integer> me : m.entrySet()) {
				if (s1.equalsIgnoreCase(me.getKey())) {
					int v = me.getValue() + 1;
					m.put(me.getKey(), v);
				}
			}
		}
		for (Map.Entry<String, Integer> me : m.entrySet()) {
			System.out.println(me.getKey() + ":" + me.getValue());
		}
	}

}
