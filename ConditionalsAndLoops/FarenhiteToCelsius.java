import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int S = s.nextInt();
	    int E =s.nextInt();
	    int W =s.nextInt();
	    
	    while(S <= E) {
			int cel = (int)((5.0/9)*(S - 32));

			System.out.println(S+"\t"+cel);F
	
			S = S + W;
		}
	}
}
