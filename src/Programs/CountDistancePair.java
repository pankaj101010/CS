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
	   String a = "abacadabbccddee";
	   // I have changed the input
	   int dist = 5;
	   //I have also changed the distance
	   //System.out.println(distance(a,dist));
	   String s ="india +91";
	   s = s.replaceAll("([a-z]{1,})\\s{0,}([\\+][0-9]{1,2})", "country code of $1 is $2");
	   System.out.println(s);

       }

}
