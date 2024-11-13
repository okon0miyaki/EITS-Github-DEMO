package sort;
import java.util.Arrays;
public class Sort {

    void merge(int[] arr, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i = 0; i < n1; i++) {
			L[i] = arr[p + i];
		}
		for(int j = 0; j < n2; j++) {
			R[j] = arr[q + 1 + j];
		}
		
		int i = 0, j = 0, k = p;
		
		while(i < n1 && j < n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	void mergeSort(int[] arr, int l, int r) {
		if(l < r) {
			int m = (l + r) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			
			merge(arr, l, m, r);
		}
		
	}
	
	static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 4, 2, 6};
		
		Sort obj = new Sort();
		obj.mergeSort(arr, 0, arr.length-1);
		
		System.out.println("Sorted Array: ");
		Sort.printArray(arr);
	}
}
    
    //public static void main(String[] args){
      //  int[] arr = {7, 3, 10, 6, 9, 1, 8, 2, 4, 5};
        //System.out.println("Array sebelum di Sorting: " + Arrays.toString(arr));
        
        //quickSort(arr);
        //System.out.println("Array Setelah di Sorting: " + Arrays.toString(arr));
    //}
//}