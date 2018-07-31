
public class MergeSortedArray {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		MergeSortedArray MSA = new MergeSortedArray();
		
	//	int[] a = {1,2,3,4,5,6,0,0,0,0,0,0};
	//	int[] b = {4,5,6,7,8,9};
		
		int[] a = {-9, -7, -3, -2, 0, 2, 4, 5, 6, 8,0,0,0,0,0,0};
		int[] b = {4,5,6,7,8,9};
		
		a= MSA.sort(a,b);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}		
	}
	
	public int[] sort(int[] a, int[] b) {
	//	int aLast = 5;
		
		int aLast = 9;
		int bLast= b.length-1;
		int abLast = aLast + bLast + 1 ;
		
		while(aLast>=0 && bLast >= 0) {
		
		if(a[aLast]>b[bLast]) {
			a[abLast]=a[aLast];
			abLast--;
			aLast--;
		}
		else if(a[aLast]<b[bLast]){
			a[abLast]=b[bLast];
			abLast--;
			bLast--;
		}
		else if(a[aLast]==b[bLast]) {
			a[abLast--]=a[aLast];
			a[abLast--]=b[bLast];
			bLast--;
			aLast--;		
			}
		}
		
		while(bLast>=0){
			a[abLast]=b[bLast];
			abLast--;
			bLast--;
		}
			
		return a;
	}

}
