public class Solution {  

    public static void rotate(int[] arr, int d) {

        int size=arr.length;
        int c=0;
        int temp[]=new int [size];
        
        for(int i=d;i<size;i++){
            temp[i-d]=arr[i];
        }
        
        for(int i = size - d; i <size; i++)
        {
            temp[i] = arr[c++];
        }
        
        for(int i = 0; i < size; i++)
        {
            arr[i] = temp[i] ;
        }
        
    }

}
