import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n) {
			int sp=1;
			while(sp<=n-i) {
				System.out.print(" ");
				sp++;
			}
			int j=1;
			int t=1;
			while(j<=i) {
				System.out.print("*");
				t++;
				j++;
			}
			 t=i-1;
			 j=1;
			 while(j<=i-1) {
				 System.out.print("*");
				 t--;
				 j++;
			 }
			 System.out.println();
			 i++;
		}

		
	}

}
