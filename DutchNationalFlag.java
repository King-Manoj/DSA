package dsa;


					//Inventor - Edsger W.Dijkstra
					//Time Complexity - O(n)
					//Space Complexity - O(1)

public class DutchNationalFlag {

	public static void main(String[] args) {
		int[] arr = {2, 0, 1, 2, 1, 0, 0, 1, 2, 0};
		sort(arr);
		
		for(int i:arr) {
			System.out.print(i + " ");
		}

	}
	public static void sort(int [] a) {
		
		//Red - 0 
		//White - 1
		//Blue - 2
		
		int sz = a.length;
		int white = 0;
		int red = 0;
		int blue = sz-1;
		
		
		while(white<=blue) {
			if(a[white]==0) {
				swap(a,red,white);
				white++;
				red++;
			}
			else if(a[white]==2) {
				swap(a,white,blue);
				blue--;
			}
			else if(a[white] == 1){
				white++;
			}
		} 
	}
	
	public static void swap(int[] a ,int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
