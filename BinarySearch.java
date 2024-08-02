package dsa;

			//Inventor - John  Mauchly 
			// Approach - Divide and Conquer (Can use only in sorted array)
			//Time Complexity 
				//Best Case - O(1)
				//Worst Case - O(log n)
			//Space Complexity - O(1)

public class BinarySearch {

	public static void main(String[] args) {
		 int[] a = {1,2,3,4,5,6,7,8,9};
		 
		 System.out.println(binarySearch(a,5));
	}
	
	public static int binarySearch(int a[],int target) {
		int n = a.length;
		int left = 0;
		int right = n-1;
		
		while(left<=right) {
			int mid = left+(right-left)/2;
			
			if(a[mid]<target) {
				left = mid+1;
			}
			else if (a[mid]==target) {
				return mid;
			}
			else {
				right = mid-1;
			}
		}
		return -1;
	}
}
