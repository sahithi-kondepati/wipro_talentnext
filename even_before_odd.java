package Arrays;
import java.util.Arrays;
public class even_before_odd {
	public static void main(String[] args) {
		int[] arr= {1,0,1,0,0,1};
		int[] output=new int[arr.length];
		int start=0;
		int end=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				output[start]=arr[i];
				start++;
			} else {
				output[end]=arr[i];
				end--;
			}
		}
		System.out.println(Arrays.toString(output));
	}
}
