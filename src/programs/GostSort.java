package programs;

public class GostSort {
    public static int matrixsum(int[][] a) {
    	int sum =0;
    	for (int i = 0; i < a.length-1; i++) {
    		for (int j = 0; j <a[i].length; j++) {
    			if (a[i][j]==0) {
    				a[i+1][j]=0;
    			}
			}
		}
    	for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <a[i].length; j++) {
				sum += a[i][j];
			}
		}   	
    	return sum;
    	
    }
	public static void main(String[] args) {
		int[][] mat ={{1,1,1,2},{0,5,0,3},{2,0,3,3}};
	//	System.out.println(mat.length);
		System.out.println(matrixsum(mat));

	}

}
