public class Solution{	
	
	public static int findUnique(int[] arr){
		int size=arr.length;
		int j;
		for(int i=0;i<size;i++) {
		
			//int j=1;
			for(j=0;j<size;j++) {
				
				if(i==j) {
					continue;
				}
				
				else if(arr[i]==arr[j]) {
					break;
				}
				
			}  
            if(j==size) 
				return arr[i];
        }
      return -1;
	}
}
