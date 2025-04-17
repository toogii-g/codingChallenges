package algorithms;

public class BinarySearchExperiment {
 
	public static int binSearch(int[] arr, int lower, int upper) {
		if (lower > upper) return -1;
		int mid = (upper + lower)/2;
		int key = 2 * mid;
		System.out.println("[lower, upper] = [" + lower + ", " + upper + "]");
		if (arr[mid] == key)return mid;
		int result = -1;
		result =  binSearch(arr, lower, mid - 1);
		if(result==-1)
		return binSearch(arr, mid + 1, upper);
	 	return result;
	}
	public static void main(String[] args) {
		int[] values = {-999, 1, 4, 5, 7, 11, 13}; 		//A[3] < 6
		//int[] values = {-999, 0, 2, 7, 9, 10, 13};      //A[3] > 6
		System.out.println(" i = " + binSearch(values, 0, 6));
	}
}