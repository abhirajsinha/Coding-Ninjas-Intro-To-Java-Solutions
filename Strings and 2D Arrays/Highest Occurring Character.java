// highest occurring character in the String.
public class solution {

	public static char highestOccuringCharacter(String inputString) {
int c1 = 0,c2 = 0,i,j;
		char maxChar = '\0';
		j = 0;
		while(j < inputString.length()) {
		i = 0;
		do {
			if(inputString.charAt(i) == inputString.charAt(j)) {
				c2++;
			}
			i++;
		}while(i < inputString.length());
		if(c2 > c1) {
			maxChar = inputString.charAt(j) ;
			c1 = c2;
		}
		c2 = 0;
		j++;
	}
		return maxChar;
	}
}
