import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ans=0,t=0,i=1;
        int place_value=1;
        while(n>0) {
        	t=n%10;
        	ans=ans+place_value*t;
        	n=n/10;
        	place_value*=
        	2;
            i++;
        }System.out.println(ans);
	}
}
