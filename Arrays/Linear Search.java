public class Solution {
    
    public static int linearSearch(int arr[], int x) {
        int i;
        int found = 0;
        int size=arr.length;
        for(i=0; i<size; i++)
	    {
	        if(arr[i] == x)
	        {
	            found = 1;
	            break;
	        }
	    }
        if(found == 1)
	    {
	        return i;
	    }
	    else
	    {
	        return (-1);
	    }     
	}
}
