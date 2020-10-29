import java.lang.*;
public class Solution {

	public static String reverseEachWord(String str) {
    String words[]=str.split("\\s");
	String reverseWord="";
	for(String w:words){
		StringBuilder sb=new StringBuilder(w);
		sb.reverse();
		reverseWord+=sb.toString()+" ";
	}
	return reverseWord.trim();
	}
}

