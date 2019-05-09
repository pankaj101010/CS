package programs;

public class SwapString {
	
	public static String text(String t) {
		char[] ch =t.toCharArray();
	    
		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])) {
				ch[i] = Character.toLowerCase(ch[i]);
			} 
			else if (Character.isLowerCase(ch[i])) {
				ch[i] = Character.toUpperCase(ch[i]);
			} 
			
		}
		
		return new String(ch);
	}

	public static void main(String[] args) {
		String val ="Hello";
		System.out.println(text(val));
	}

}
