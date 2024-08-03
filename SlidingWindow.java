package dsa;

			//Time Complexity - O(n)
			//Space Complexity - O(1)

public class SlidingWindow {

	public static void main(String[] args) {
		 int a[] = {1,2,3,4,5,6,7,8,9};
		 int k = 3;
		 System.out.println(maxSubArray(a,k));
	}
	public static int maxSubArray(int[] a,int windowSize) {
		int arrSize = a.length;
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		
		for(int i=0;i<windowSize;i++) {
			currentSum+=a[i];
		}
		maxSum = currentSum;
		
		for(int i=windowSize;i<arrSize;i++) {
			currentSum+= a[i] - a[i-windowSize];
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}
}
