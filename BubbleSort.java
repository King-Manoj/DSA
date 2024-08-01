package dsa;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {3,2,8,5,3,8,9}; 
		
		// calling the bubbleSort to sort the array  
		bubbleSort(a);
		
		//Printing the array
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
	
	public static void bubbleSort(int[] a) {
		int n = a.length;
		
		for(int i=1;i<n;i++) {
			boolean swapped = false;
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}
	
	public static void swap(int[] a,int i, int j) {
		 int temp = a[i];
		 a[i] = a[j];
		 a[j] = temp;
	}

}
