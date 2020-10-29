
public class Solution {

    public static void sort012(int[] arr){

        int size=arr.length;
        int nextZero=0;int nextTwo=size-1;
        int temp=0;int temp2=0;int i=0;

          while(i<=nextTwo){
        	if(arr[i]==0){
        		temp=arr[nextZero];
        		arr[nextZero]=arr[i];
        		arr[i]=temp;
        		nextZero++;
			}
		 if(arr[i]==2)
        	{
        		temp2=arr[nextTwo];
        		arr[nextTwo]=arr[i];
        		arr[i]=temp2;
        		nextTwo--;
			}
              else
                  i++;
          }
		}
    }


