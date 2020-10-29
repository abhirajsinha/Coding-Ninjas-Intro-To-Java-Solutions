import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		
		while(i<=n)
		{
			int j=1;int t=n;
			while(j<=n) {
				if(i+j==n+1)
                System.out.print("*");
				else
				System.out.print(t);
				t--;
				j++;
			}
			System.out.println();
			i++;
		}

	}
}
