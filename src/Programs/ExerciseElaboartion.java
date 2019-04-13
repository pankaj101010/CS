package Programs;

public class ExerciseElaboartion {
	public static int exerciseElaboration(int p, int n) {
		String q = Integer.toString(p);
		for (int i = 1; i <= n; i++) {
			q = q.concat("0");
		}
		q = q.concat(Integer.toString(p));
		long num=(int)Math.pow((double)Integer.parseInt(q), 2.0);
		int sum=0;
		while(num>0)
		{
			sum+=num%10;
			num /=10;
		}
		return sum;
	}

	public static void main(String[] args) {
			System.out.println(exerciseElaboration(5, 10));
	}
}
