package dsa;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int a[] = {3,2,8,5,3,8,9};
		int sort[] = mergeSort(a);
		
		System.out.println(Arrays.toString(sort));
	}
	public static int[] mergeSort(int a[]) {
		int n = a.length;
		int mid = n/2;
		
		if(n==1) {
			return a;
		}
		
		int left[] = mergeSort(Arrays.copyOfRange(a, 0, mid));
		int right[] = mergeSort(Arrays.copyOfRange(a,mid,n));
		
		return (merge(left,right));
	}
	public static int[] merge(int a[],int b[]) {
		int alen = a.length;
		int blen = b.length;
		int[] join = new int[alen+blen];
		int i=0,j=0,k=0;
		while(i<alen && j<blen) {
			
			if(a[i]<b[j]) {
				join[k++] = a[i++];
			}
			else {
				join[k++] = b[j++];
			}
		}
		
		while(i<alen) {
			join[k++] = a[i++];
		}
		while(j<blen) {
			join[k++] = b[j++];
		}
		
		return join;
	}

}
