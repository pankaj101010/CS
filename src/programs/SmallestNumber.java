package programs;

public class SmallestNumber {

	public static int small(int n) {
		
		if (n==1) {
			return 0;
		}else {
			return (int)Math.pow(10, n)/10;
		}
	}
	
	public static void main(String[] args) {
	int x =3;
    System.out.println(small(x));
	}

}
