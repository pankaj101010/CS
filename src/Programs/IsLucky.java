package Programs;

public class IsLucky {
public static boolean lucky(int num) {
	String s =" ";
	s =  s.valueOf(num);
	int k = 0;
	int p =0 ;
	int r = s.length();
	int y = r/2;
	char [] u = s.toCharArray();
       for (int i = 0; i < u.length/2; i++) {
		   p += u[i];
	} 
       for (int i = u.length-1; i >=u.length/2; i--) {
		k += u[i]; 
	}   	   
		//System.out.println(p==k);

	return p==k;
}
	public static void main(String[] args) {
	int num = 1230;
	System.out.println(lucky(num));
	
	}

}
