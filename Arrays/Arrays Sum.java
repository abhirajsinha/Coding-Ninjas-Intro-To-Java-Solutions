import java.util.Scanner;
public class Solution {
    public static int sum(int[] input) {
    	int size=input.length;
        int sum=0;
	for(int i=0;i<size;i++) {
		sum+=input[i];
	}
	return sum;
    }
  
}
