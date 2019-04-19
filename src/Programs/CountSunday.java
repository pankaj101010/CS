package Programs;

public class CountSunday {
	public static int countSunday(int n , String day) {
		 int sun = 1;
		 int sum =0;
		switch(day) {
		
		case "sunday" :
			sun =0;
			sum =n/7;
			n=n%7;
			break;
		case "monday": 
	                   sun= 6;
	                   sum = n/7;
	                   n=n%7; 
	                   break;
	              
		case "tuesday" :
			sun= 5;
        sum = n/7;
        n=n%7; 
        break;			
		case "wednsday":
			sun= 4;
            sum = n/7;
            n=n%7; 
            break;
		case "thursday" :
			sun= 3;
            sum = n/7;
            n=n%7;
            break;
		case "friday" :
			sun= 2;
            sum = n/7;
            n=n%7; 
            break;
		case "saturday":
			sun= 1;
            sum = n/7;
            n=n%7; 
            break;
	
		
		}
		if(sun<=n) {
			sum++;
		}
		
		return sum;
	}
	
	

	public static void main(String[] args) {
		String start ="saturday";
		int n  = 22;
		System.out.println(countSunday(n,start));

	}

}
