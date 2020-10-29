
public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
int i=0;int j=0;int k=0;
int s1=arr1.length;
int s2=arr2.length;
int res[]=new int[s1+s2];
        
		while( i<s1 &&  j<s2) {
			if(arr1[i]<arr2[j]){
				res[k]=arr1[i];
				i++;k++;
			}
			else {
				res[k]=arr2[j];
				j++;k++;
			}
		}
		
		while(i<s1) {
			res[k++]=arr1[i++];
		}
		while(j<s2) 
			res[k++]=arr2[j++];
            return res;
    }	  
}
