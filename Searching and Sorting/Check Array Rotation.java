
public class Solution {

    public static int arrayRotateCheck(int[] arr){
        int n=arr.length;
      for(int i=0;i<n;i++){
			
			if(arr[i]>arr[i+1])
				return i+1;
		}
        return 0; 

    }

}
