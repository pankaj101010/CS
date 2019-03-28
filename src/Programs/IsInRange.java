package Programs;

public class IsInRange {
	public static boolean range(int a,int b,int c) {
		if (b>=a && b<=c ) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.println(range(a,b,c));
	}

}
