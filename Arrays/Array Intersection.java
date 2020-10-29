
public class Solution{  
    
    public static void intersections(int input1[], int input2[]) {
    	//Your code goes here
        int i = 0;
       //int j = 0;
 
     while(i<input1.length){
            int j=0;
            while(j<input2.length){
                if(input1[i]==input2[j])
                {
                    System.out.print(input2[j]+" ");
                    input2[j]=-22; //you can use Integer.MIN_VALUE in stead of -22
                    break;
                }
                j++;
            }
            i++;
        }
    }
}
