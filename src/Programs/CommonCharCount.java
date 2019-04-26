package Programs;


public class CommonCharCount {
	public static int countChar(String s1, String s2) {
		 int[] a = new int[26];
		    int[] b = new int[26];
		    for (char c: s1.toCharArray())
		        a[c - 'a']++;
		    for (char c: s2.toCharArray())
		        b[c - 'a']++;
		    int s = 0;
		    for (int i = 0; i < 26; ++i) 
		        s +=Math.min(a[i],b[i]);
		    return s;        
		
	}

	public static void main(String[] args) {
		String s1 ="pankaj";
		String s2 ="pankaj";
		System.out.println(countChar(s1,s2));
	}

}
