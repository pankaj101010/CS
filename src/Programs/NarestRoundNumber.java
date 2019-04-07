package Programs;

public class NarestRoundNumber {
public static int round(int n) {
	int y = n%10;
    if(y==0){
        return n;
    }else{
	int h = 10-y;
	int end = n+h;
    return end;
    }
}
	public static void main(String[] args) {
		int x = 197;
		System.out.println(round(x));

	}

}
