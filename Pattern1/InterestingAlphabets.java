import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
		int N= s.nextInt();
		int i=1;
		int alp=65;
		while((char)(i)<=(char)(N))
		{
			int j=i;
			char start=(char)(65+N-i);
			while(j>=1) {
				System.out.print(start);
				start=(char)(start+1);
				j--;
			}
			System.out.println();
			i++;
		}
	}
}
