package Arrays;

public class remove_duplicates {
	public static void main(String[] args) {
		int[] arr= {12,34,12,45,67,89};
		int n=arr.length;
		int[] temp=new int[n];
		int newlength=0;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<newlength;j++) {
				if(arr[i]==temp[j]) {
					count++;
				}
			}
			if(count==0) {
				temp[newlength]=arr[i];
				newlength++;
			}
		}
		for(int i=0;i<newlength;i++) {
			System.out.print(temp[i] + " ");
		}
	}

}
