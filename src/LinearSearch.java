
public class LinearSearch {

	public int LinearSearchMethod(int arr[],int n, int element){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == element)
				return i+1;
		}
		return -1;
	}
	
}
