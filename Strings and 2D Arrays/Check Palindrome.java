
public class Solution {

	public static boolean checkPalindrome(String str){
	int n=str.length();
        String a="";
        for(int i=0;i<n;i++){
            a=str.charAt(i)+a;
        }
          for(int i=0;i<n;i++){
              //OPTION 1 FOR CHECK EAUAL
        		if(str.charAt(i)!=a.charAt(i)){
                    return false;
                }
        }
        return true;
          //OPTION 2 FOR CHECK EAUAL
			// if(str.equals(a)){
			// return true;
			// }
	}
}
