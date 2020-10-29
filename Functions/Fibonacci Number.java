
public class Solution {
	
	public static boolean checkMember(int n){
		//int num0 = 0;
		int num1 = 0;
        int num2=1;
		int sum;
		while(num1<n) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		if (n == num1)
			return true;
		else
			return false;
    }
}
