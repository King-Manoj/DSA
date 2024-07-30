package dsa;

			//Time Complexity - O(n^3)
			//Space Complexity - O(n^3)

import java.util.*;


public class SubArray {

	public static void main(String[] args) {
		 int[]  a = {1,2,3,4};
		 int n = a.length;
		 
		 List<List<Integer>> l = new ArrayList<>();
		 for(int i=0;i<n;i++) {
			 
			 for(int j=i;j<n;j++) {
				 List<Integer> l2 = new ArrayList<>();
				 for(int k=i;k<=j;k++) {
					 l2.add(a[k]);
				 }
				 l.add(l2);
			 }
			 
		 }
		 System.out.println(l);
	}

}
