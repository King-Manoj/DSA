package dsa;
import java.lang.*;
public class KadanesAlgorithm {

	public static void main(String[] args) {
		 
		int[] a = {2,3,4,-3,-5,5,12,-19,20,-30};
		int max = maxSubArray(a);
		System.out.println(max);
	}
	public static int maxSubArray(int[] a) {
		int n = a.length;
		int sum=0;
		int maxSum = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			sum = Math.max(sum+a[i],a[i]);
			maxSum = Math.max(maxSum, sum);
//			if(sum<0) {
//				sum = a[i];
//			}
//			else {
//				sum+=a[i];
//			}
//			
//			if(maxSum<sum) {
//				maxSum = sum;
//			}
		}
		return maxSum;
	}

}
