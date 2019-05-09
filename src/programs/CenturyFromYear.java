package programs;

public class CenturyFromYear {
 public static int century(int year) {
	// if (year>=1000) {
	 if (year<100) {
		return 1;
	}
		 int x = year%10;
		year =year/10;
		year =year/10;
		if (x>0) {
			return year+1;
		}
		return year;
//	}
//	 else {
//		 int x = year%10;
//		 year =year/10;
//	    year =year/10;
//	 return year+1;
//	 }
 }
	public static void main(String[] args) {
	int year = 101;
	System.out.println(century(year));
	}

}
