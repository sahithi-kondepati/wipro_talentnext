package Arrays;

public class max_in_2darray {
	public static void main(String[] args) {
		int[][] arr= {
				{1,23,45},
				{55,121,222},
				{56,77,89}};
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		System.out.println(max);
	}
}
