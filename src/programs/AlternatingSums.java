package programs;

public class AlternatingSums {
	public static int[] sum(int[]a) {
		int[] ret = new int[2];
		int f = 0;
		int s=0;
		for (int i = 0; i < a.length; ) {
			   ret[0] +=a[i];
			   i=i+2;
		}
		for (int i = 1; i < a.length; i=i+2) {
			ret[1] +=a[i];
		}
		return ret;
	}

	public static void main(String[] args) {
		int [] a = {50, 60, 60, 45, 70};
		for (int i : sum(a)) {
			System.out.print(i+" ");
		}
	}

}
