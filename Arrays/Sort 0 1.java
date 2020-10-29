public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
        int k=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<1){
                k++;
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
            }
        }
    }
}
