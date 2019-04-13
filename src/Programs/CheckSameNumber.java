package Programs;

import java.util.HashSet;
import java.util.Set;

public class CheckSameNumber {
	public static boolean sameNumber(int[]a,int[]b) {
		Set<Integer> f = new HashSet<Integer>();
		Set<Integer> g = new HashSet<Integer>();
		//Set<Integer> h = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			f.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			g.add(b[i]);
		}
		int result = f.size()+g.size();		
			f.addAll(g);
		return f.size()!=result;
		
	}

	public static void main(String[] args) {
		int [] a= {1,1,2,2,3,4,5};
		int [] b= {3,4,6,7};
		System.out.println(sameNumber(a,b));

	}

}
