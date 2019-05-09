package programs;

import java.util.ArrayList;

public class ReplaceMiddle {
	static int[] middle(int[] a) {
		
		 if (a.length%2==0) {
			int[] x = new int[a.length-1];
			int i = 0;
			
			 for ( int j = 0; i < a.length; j++) {
	                if (i == a.length / 2 - 1) {
	                    x[j] = a[(a.length / 2)-1] + a[a.length / 2 ];
	                    i += 2;
	                } else {
	                    x[j] = a[i];
	                    i++;
	                }
	            }
			 return x;
		}
		
		return  a;
	}

	public static void main(String[] args) {
		int [] a =  {7, 2, 2, 5, 10, 7};
		
//		ArrayList al = new ArrayList();
//		for (int i = 0; i < a.length; i++) {
//			if ((a.length-1)/2==i) {
//				al.add(a[i]+a[i+1]);
//			}
//			else {
//				al.add(a[i]);
//			}
//		}
//		al.remove(((a.length-1)/2)+1);
//		System.out.println(al);
		for (int i : middle(a)) {
			System.out.print(i+" ");
		}
	}

}
