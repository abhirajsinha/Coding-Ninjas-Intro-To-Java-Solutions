public class solution {

	public static String removeAllOccurrencesOfChar(String input, char c) {
        String result = "";
		for(int i= 0;i < input.length();i++) {
			if(input.charAt(i) == c)
				continue;
			result += input.charAt(i);
		}
		return result;
        
	}

}
