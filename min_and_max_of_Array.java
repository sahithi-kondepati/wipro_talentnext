package Arrays;

public class min_and_max_of_Array {
	public static void main(String[] args){
		int[] arr= {15,22,8,19,31,4,11};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum is : " + min);
		System.out.println("Maximum is : " + max);
	}
}
