package com.basics.string;

import java.util.StringTokenizer;

public class StrRemoveMultSpaces {

	public static void main(String a[]) {
		String str = "String With        Multiple    Spaces";
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		while (st.hasMoreElements()) {
			sb.append(st.nextElement()).append(" ");
		}
		System.out.println(sb.toString().trim());
// remove multiple spaces
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 32) {
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(j) == 32) {
						
					} else {
						sb1.append(" ");
						i=j-1;
						break;
					}
				}
			}
			else{
				sb1.append(str.charAt(i));
			}
		}
		System.out.println(sb1);
		
		//remove except alphabets
		String s="bkj3n4for(332jnb%%icn&gg(0 ertwert";
		StringBuffer sb2 = new StringBuffer();
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)==32) ||((s.charAt(i)>96)&&s.charAt(i)<123)||((s.charAt(i)>64)&&s.charAt(i)<91)){
				sb2.append(s.charAt(i));
			}
		}
		System.out.println(sb2);
		
		
	}
}
