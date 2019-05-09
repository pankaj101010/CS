package programs;

public class ArraySumAdjacentDifference {
	public static int sum(int[] a) {
		int add =0;
		int t=0;
		for (int i = 0; i < a.length-1; i++) {
			add += Math.abs(a[i]-a[i+1]);
			//System.out.println(add);
			//t= add+add;
		}
		return add ;
//		int add =0;
//		for (int i = 0; i <a.length-1; i++) {
//			if (a[i] >a[i+1]) {
//				add += a[i] -a[i+1];
//			}
//			else if(a[i] < a[i+1]){
//				add += a[i+1] - a[i];
//			}
//		}
//		return add;
		
	}

	public static void main(String[] args) {
		int [] i = {4, 7, 1, 2};
		System.out.println(sum(i));
		
	}

}
