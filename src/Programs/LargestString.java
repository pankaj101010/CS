package Programs;

import java.util.ArrayList;

public class LargestString {
	public static String[] largest(String[]a) {
		//"avc","abcd","eeeed"
		int v = 0;
		ArrayList<String> b = new ArrayList<String>();
		
		for (int i = 0; i < a.length; i++) {
			if (v<a[i].length()) {
				v = a[i].length();
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (v==a[i].length()) {
				b.add(a[i]);
				
			}
		}
		String[] m = new String[b.size()];
		for (int i = 0; i < m.length; i++) {
			m[i] = b.get(i);
		}
		System.out.println(v);
		return m;
	}
		

	public static void main(String[] args) {
		String[] s = {"a", 
				 "abc", 
				 "cbd", 
				 "zzzzzz", 
				 "a", 
				 "abcdef", 
				 "asasa", 
				 "aaaaaa"}; ////{"aba", "aa", "ad", "vcd", "aba"};
		//System.out.println(s.length);
		for (String string : largest(s)) {
			System.out.print(string+" ");
		}
			
		}

}
