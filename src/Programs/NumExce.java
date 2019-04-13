package Programs;

public class NumExce {
	public static int exerciseElaboration(int p, int n) {
		int mul = p;
		int sum=0;
		for (int i = 0; i <=n; i++) {
			p=p*10;
		}
		long x = p+mul;
		long num = x*x;
		while(num>0) {
			sum += num%10;
			num /=10;
		}
		
		
		return sum;
		
	}
	     
	public static void main(String[] args) {
	System.out.println(exerciseElaboration(5, -1));
	}

}
