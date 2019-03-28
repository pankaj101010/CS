package Programs;

import java.util.ArrayList;

public class LargestString {
	public static String[] largest(String[]a) {
		String [] temp = new String [a.length];
		ArrayList<String>temp1 = new ArrayList<String>();
		String x = " ";
		for (int i = 0; i < a.length; i++) {
 			for (int j = 0; j < a.length; j++) {
				if (a[i].length()>a[j].length()) {
					temp[i] =a[i];	 //temp.add(a[i]);
				}
			}
		} 
		int j = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i]==null) {
				
			}
			else {
				for (; j < temp.length; j++) {
					temp1.add(j, temp[i]);
					break;
				}
			}
		}
		String[] modify = new String[temp1.size()];
		for (int i = 0; i < modify.length; i++) {
			modify[i]=temp1.get(i);
		}
		
		return modify;
	}

	public static void main(String[] args) {
		String[] s = {"abcd","eeee"}; ////{"aba", "aa", "ad", "vcd", "aba"};
		System.out.println(s.length);
		for (String string : largest(s)) {
			System.out.print(string+" ");
		}
			
		}

}
