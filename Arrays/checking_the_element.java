package Arrays;

public class checking_the_element {
	public static void main(String[] args){
		int[] arr= {1,4,34,56,7};
		int index=check(arr,56);
		System.out.println(index);
	}
	static int check(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
}
