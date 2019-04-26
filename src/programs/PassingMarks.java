package programs;

public class PassingMarks {
public static boolean marks(double pm , String gd) {
	char [] Grades = {'F','E','D','C','B','A'};
	int count =0;
     for (int i = 0; i <gd.length(); i++) {
    	 for (int j = 0; j < Grades.length; j++) {
    		 if (gd.charAt(i)==Grades[j]) {
    			 count += j;
    		 }
		}
       }	
     int x = gd.length();
     float ncount = (float)count/x;
     if (ncount>=pm) {
    	 return true;	
	}else {
		return false;
	}
}

	public static void main(String[] args) {
		double pm = 3;
		String gd ="ABC";
		System.out.println(marks(pm,gd));
	}

}
