package programs;

import java.util.ArrayList;

public class SameDigitNumber {
 public static boolean same(int a) {
  
	 int x = 0;
	 int count =0;
	 ArrayList<Integer> abc = new ArrayList<Integer>();
	while(a>0) {
		int temp = a/10;
		int n = a%10;
		abc.add(x,n);
		a=temp;	
		x++;
	}
	for (int i = 1; i < abc.size(); i++) {
		if (abc.get(i-1)==abc.get(i)) {
		}
		else {
			count++;
		}
	}
       if (count>0) {
		return false;
	}
		 return true;
 }
	public static void main(String[] args) {
		int a = 12345;
       System.out.println(same(a));
	}

}
