public class Solution {

	public static int countWords(String str){
        int c=0;
		int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)==' ')
                c++;   
        }
        return c+1;
	}
	
}
