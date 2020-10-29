public class Solution{  

    public static int binarySearch(int[] arr, int val) {
 int low=0,high=arr.length-1,mid=0;
 while(low<=high)
 {
   mid=(low+high)/2;
   if(val==arr[mid])
   {     

    return mid;
   } 
   else if(val<arr[mid])
   {     high=mid-1;
   }
   else if(val>arr[mid])
   {     low=mid+1;
   }
 }
return -1;
    }

}
