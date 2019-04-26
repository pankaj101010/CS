package programs;

import java.util.Arrays;

public class SortedByHeight {
	public static int[] height(int[]a) {
		int[] sort = new int[a.length];
		int count =0;
		for (int i = 0; i < sort.length; i++) {
			if (a[i]==-1) {
				sort[i]=a[i];
				count++;
			}
		}
		Arrays.sort(a);
		if (count==0) {
			return a;	
		}
		
		int g;
		for ( g = 0; g < sort.length; g++) {
			if (a[g]!=-1) {
				break;
			}
		}
		for (int i = 0; i < sort.length; i++) {
			if (sort[i]!=-1) {
				sort[i]=a[g];
				g++;
			}
		}
		
		return sort;
	}

	public static void main(String[] args) {
		int[] a = {4, 2, 9, 11, 2, 16};
		
		for (int i : height(a)) {
			System.out.print(i+" ");
		}
	}

}
