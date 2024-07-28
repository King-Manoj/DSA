package dsa;
  
			// Quick Sort (Partitioning Exchange Method) - Divide and Conquer
			// Inventor - Charles Antony Richard Hoare @ Tony Hoare
			//Time Complexity 
					//Best Case - O(n log n)
					//Worst Case -O(n^2)
			//Space Complexity 
					//Best Case - O(log n)
					//Worst Case -O(n)

			
public class QuickSort {
	//Quick Sort Method 
	public static void quickSort(int[] a,int lb,int ub) {
		 
		if(lb<ub) {
			int mid = partition(a,lb,ub);
			quickSort(a,lb,mid-1);
			quickSort(a,mid+1,ub);
		}
	}
	//Partition Method 
	public static int partition(int[] a,int lb,int ub) {
		
		int pivot = a[ub];
		int st = lb;
		int en = ub-1;
		
		  
		while(st<=en) {
			
			while(st<=en && a[st]<=pivot) {
				st++;
			}
			while(st<=en && a[en]>pivot) {
				en--;
			}
			
			if(st<en) {
				swap(a, st,en);
			}
		}
		
		//swap the elements so that the pivot will come to its original position
		swap(a,st,ub);
		
		// returning the start index as 
		return st;
	}
	
	// Swapping the Array 
	public static void swap(int[] a,int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {
		int a[] = {3,2,8,5,3,8,9};
		int n = a.length;
		// calling the quickSort to sort the array from 0th index to the n-1th index
		quickSort(a, 0, n-1);
		
		//Printing the array
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
}
