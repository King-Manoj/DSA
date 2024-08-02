package dsa;
			//Time Complexity 
				//Best Case - O(1)
				//Worst Case - O(n)
			//Space Complexity - O(1)

public class LinearSearch {

	public static void main(String[] args) {
		 int [] a = {2,4,3,1,6,8,5,9};
		 
		 System.out.println(linearSearch(a,8));
	}
	public static int linearSearch(int[] a, int target) {
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			if(a[i]==target)
				return i;
		}
		return -1;
	}

}
