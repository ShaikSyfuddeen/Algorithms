package main;
public class MergeSort {
	
	private void merge(int[] arr, int start, int mid, int end){
		
		int i = start;
		int j = mid+1;
		int[] res = new int[end-start+1];
		int k = 0;
		while(i<=mid && j<=end) {
			
			if(arr[i] < arr[j]) {
				res[k++] = arr[i++];
			} else {
				res[k++] = arr[j++];
			}
		}
		
		while(i<=mid) {
			res[k++] = arr[i++];
		}
		
		while(j<=end) {
			res[k++] = arr[j++];
		}
		
		for(int l=0; l<k; l++) {
			arr[start++] = res[l];
		}
		
	}
	
	public void mergeSort(int[] arr, int start, int end) {
		
		if(start < end) {
			int mid = (end - start)/2 + start;
			
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);
			
		}
	}

}
