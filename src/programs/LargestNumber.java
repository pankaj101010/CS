package programs;

public class LargestNumber {
public static int largest(int n) {
	String x ="1";
    for(int i =1;i<=n;i++){
          String d = "0";
          x += d;
    }
    int f = Integer.parseInt(x);
    return f-1;
}

	

	public static void main(String[] args) {
		  int r =2;
  System.out.println(largest(2));
  /*
   * or return Math.pow(10,n)-1;
   */
}
}