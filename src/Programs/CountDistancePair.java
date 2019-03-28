package Programs;

import java.util.ArrayList;

public class CountDistancePair {
	public static int distance(String a, int dist) {
		char[] x = a.toCharArray();
		int count =0;
		for (int i = 0; i < x.length-dist-1; i++) {
			    if (x[i]==x[i+dist+1]) {
					count++;
				}
		}
		
		return count;
	}

	public static void main(String[] args) {
	   String a = "abacada";
	   int dist = 1;
	   System.out.println(distance(a,dist));

       }

}
