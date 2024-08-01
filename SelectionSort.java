package dsa;

				//Inventor - David L.Shell
				//Time Complexity - O(n^2)
				//Space Complexity - O(1)

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {3,2,8,5,3,8,9};
		 
		// calling the selectionSort to sort the array  
		selectionSort(a);
		
		//Printing the array
		for(int i : a) {
			System.out.print(i + " ");
		}

	}
	public static void selectionSort(int [] a) {
		int n = a.length;
		
		for(int i=0;i<n-1;i++) {
			 for(int j=i+1;j<n;j++) {
				 if(a[i]>a[j]) {
					 swap(a,i,j);
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
