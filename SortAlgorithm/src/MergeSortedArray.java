/*
You are given two sorted arrays, A and B, where A has a large enough buffer at the end to hold B. 
Write a method to merge B into A in sorted order.
*/

public class MergeSortedArray {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		MergeSortedArray MSA = new MergeSortedArray();
		
		/*
		int[] a = {1,2,3,4,5,6,0,0,0,0,0,0};
		int[] b = {4,5,6,7,8,9};	
		a =  MSA.sort(a,b,6,6);
		*/
		
		int[] a = {-9, -7, -3, -2, 0, 2, 4, 5, 6, 8,0,0,0,0,0,0};
		int[] b = {4,5,6,7,8,9};
		
		a= MSA.sort(a,b,10,6);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}		
	}
	
	public int[] sort(int[] a, int[] b, int aLength, int bLength) {
	
		int aLast = aLength-1;
		int bLast= bLength-1;
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
