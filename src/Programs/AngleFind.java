package Programs;

public class AngleFind {
	public static String angle(int m) {
		if(m<90){
			  return "acute";
			 }
			  if(m==90){
			  return "right";
			 }
			  if(90<m || m<180){
			  return "obtuse";
			 }
			  if(m==180)
			 {
			  return "straight";
			 }
			  return null;
	}

	public static void main(String[] args) {
		int x = 360;
		System.out.println(angle(x));
	}

}
