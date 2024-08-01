package dsa;

			//Time Complexity 
					//Best Case - O(n)
					//Worst Case - O(n^2)
			//Space Complexity - O(1)

public class InsertionSort {

	public static void main(String[] args) {
		int a[] = {3,2,8,5,3,8,9};
		 
		// calling the insertionSort to sort the array  
		insertionSort(a);
		
		//Printing the array
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
	public static void insertionSort(int [] a) {
		int n = a.length;
		for(int i=1;i<n;i++) {
			for(int j=i-1;j>0;j--) {
				if(a[j]<a[j-1]) {
					swap(a,j-1,j);
				}
				else {
					break;
				}
			}
		}
	}
	
	public static void swap(int[] a,int i, int j) {
		 int temp = a[i];
		 a[i] = a[j];
		 a[j] = temp;
	}
}
