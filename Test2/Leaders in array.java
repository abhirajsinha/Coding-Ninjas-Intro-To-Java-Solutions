public class Solution {

	public static void leaders(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			boolean allSmaller=true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					allSmaller=false;
					break;
				}
			}
			if(allSmaller) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}
	
}
