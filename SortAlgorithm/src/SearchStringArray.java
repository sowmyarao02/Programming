/*	Given a sorted array of strings that is interpresed with empty strings, write 
	a method to find the location of a given string
*/


public class SearchStringArray {
	
	
	public static void main(String[] str) {
		
		String[] a = new String[] {"at","","","","ball",
				"","","cat","","","dad","",""};
		
	//	String k = "ball"; // STRING FOUND AT --- 4
	//	String k = "cat";  // STRING FOUND AT --- 7
	//	String k = "dad";  // STRING FOUND AT --- 10
		String k = "cat";   // STRING FOUND AT --- 7
		
		SearchStringArray s = new SearchStringArray();
		int r = s.bSearch(a, k, 0, a.length-1);
		
		if(r == -1)
			System.out.println("### STRING NOT FOUND ###");
		else
			System.out.println("STRING FOUND AT --- "+r);
		
	}
	
	public int bSearch(String[] a, String k,int f,int l) {
		
		int m = (f+l)/2;
		int m2=m;
		
		while(m2>=f && "".equals(a[m2]) ) {
			m2--;
		}
		
		if(m2>=f) {
		if(k.equals(a[m2])) {
			return m2;	
		}
		else if(k.compareTo(a[m2])<0) {
			return bSearch(a,k,f,m2-1);
		}
		else if(k.compareTo(a[m2])>0) {
			return bSearch(a,k,m+1,l);
			}
		}
		else {
			return bSearch(a,k,m+1,l);
		}
		
		return -1;
	}
	
	

}
