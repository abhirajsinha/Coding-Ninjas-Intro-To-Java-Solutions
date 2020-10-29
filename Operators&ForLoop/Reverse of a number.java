import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
int n= scan.nextInt();
int rev=0;
int r;
while (n>0){
r = n%10;
rev = rev *10 + r ;
n=n/10;
}
System.out.print(rev);
	}
}
