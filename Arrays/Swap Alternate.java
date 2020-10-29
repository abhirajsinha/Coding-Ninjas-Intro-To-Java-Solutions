
public class Solution {
    
    public static int[] swapAlternate(int[] arr) {
        int i=0;
	int size=arr.length;
        
	  for(i=0;i<size;i=i+2) {
          if(i==arr.length-1)
              break;
	    	int temp=arr[i];
	    	arr[i]=arr[i+1];
	    	arr[i+1]=temp;
	    }	
	  return arr;

    }

}
