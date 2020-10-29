
public class Solution{  

    public static void bubbleSort(int[] a){
     	int n=a.length;
		//int flag=0;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					//flag++;
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
        }
    }  

}
