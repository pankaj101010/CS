package programs;

public class SummaryProficiency {
 static	int summaryProficiency(int[] a, int n, int m) {
		   int add=0;
		   int count = 0;
		   for(int i=0;i<a.length;i++){
		      if(count==n)
		      {
		         break;
		      } else{
		       if(a[i]>=m)
		       {
		          add+=a[i];
		          count++;
		       }
		      }
		       
		   }
		   return add;
		}


	public static void main(String[] args) {

int[] a = {4, 2, 3, 6, 2, 5, 4};
int n= 3;
int m= 4;
		System.out.println(summaryProficiency(a,n,m));

	}

}
