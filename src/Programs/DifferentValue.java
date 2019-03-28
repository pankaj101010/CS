package Programs;

import java.util.Arrays;

public class DifferentValue {
	public static int diff(int[] a, int d) {
		int c = 0;
		int[] temp = new int[(a.length - 1) * a.length];
		int z = 0;
		int y = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i != j) {
					temp[z] = a[i] - a[j];
					z++;
				}
			}
		}
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] <= d) {
				c++;
			}
		}
		int[] lessthand = new int[c];
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] <= d) {
				lessthand[y] = temp[i];
				y++;
			}
		}
		Arrays.sort(lessthand);
		if (lessthand[lessthand.length - 1] > 0)
			return lessthand[lessthand.length - 1];
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 3, 7 };
		int digit = 3;
		System.out.println(diff(a, digit));
	}

}
