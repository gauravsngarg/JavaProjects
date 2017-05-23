
public class BinarySearch {
	
	public int BinarySearchMethod(int arr[], int low, int high, int element){
		
		if(low< high){
			int mid = (low+high)/2;
			
			if(arr[mid] < element){
				low = mid;
			}
			else if(arr[mid] > element){
				high = mid;
			}
			else{
				return mid;
			}
			
			return BinarySearchMethod(arr, low, high, element) ; 
		}
		else
		
		return -1;
	}

}
