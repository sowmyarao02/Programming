/*
Given a sorted array of n integers that has been rotated an unknown number of times, 
write code to find an element in the array. You may asume that the array was originally sorted in increasing Order.
*/

public class SearchRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	/*
	 * 	Test 1
	 *	int a[] = new int[] {4,5,6,7,8,1,2,3};
	 *	int k=2;
	 *	### SEARCH RESULT ### -1 6
	 *	### PIVOT FOUND ###5
	 *	
	 */
		
	/*
	 * 	Test 2
	 * 	int a[] = new int[] {6,7,8,9,1,2,3,4,5};
	 *  int k=1;
	 * 
	 */
		
	/*
	 * int a[] = new int[] {15,16,19,20,25,1,3,4,5,7,10,14};
	 * int k=5;
	 * ### SEARCH RESULT ### -1 8
	 * ### PIVOT FOUND AT ### 5
	 * 	
	 */
		
		int a[] = new int[] {15,16,19,20,25,1,3,4,5,7,10,14};
		int k=5;
		
		SearchRotatedArray s = new SearchRotatedArray();
		
		int pivot=s.findPivot(a,0,a.length-1,k);
		System.out.println("### PIVOT FOUND AT ### "+(pivot+1));
		
		int b = 0;
		if(pivot==0) {
			b = s.binarySearch(a,0,a.length-1,k);
			System.out.println("### KEY FOUND AT ### "+b);
		}				
	}
	
	public int findPivot(int[] a,int f, int l,int key) {
		int m= (l+f)/2;
		if(f<l) {
			
		if(a[m]>a[m+1]) {
			int k1=binarySearch(a,0,m,key);
			int k2=binarySearch(a,m+1,a.length-1,key);
			System.out.println("### SEARCH RESULT ### " +k1+ " "+k2);
			return m;	
		}
		
		if(a[m]<a[f]) {
			return findPivot(a,f,m,key);
		}
		
		else if(a[m]>a[l]) {
			return findPivot(a,m,l,key);
		}
		}
		return -1;		
	}
	
	public int binarySearch(int a[],int f, int l, int key) {
		
		int m= (l+f)/2;
		
		if(f<=l) {
			
		if(key==a[m])
			return m;
		else if(key<a[m])
			return binarySearch(a, f,m-1,key);
		else if(key>a[m])	
			return binarySearch(a,m+1,l,key);
		
		}
		
		return -1;
	
	}
	
  
}
