public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {

        int size=arr.length;
        int i=0;
        int j=0;
        
      for(i=0;i<size;i++){
          
            if(arr[i]!=0)
            {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j++;
       	 }
      }
    }
}
