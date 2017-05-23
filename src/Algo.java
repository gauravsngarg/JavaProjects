
public class Algo {
	public static void main(String args[]){
		
		int arr[] = {1,3,4,5,2,44,32,13,54,64,77};
		int element = 5;
		//Linear Search
		//LinearSearch ob = new LinearSearch();
		//System.out.print(ob.LinearSearchMethod(arr, arr.length, element));
		
		//Binary Search
		BinarySearch ob = new BinarySearch();
		System.out.print(ob.BinarySearchMethod(arr, 0, arr.length-1, element) + 1);
	}

}
