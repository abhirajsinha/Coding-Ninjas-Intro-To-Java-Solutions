import java.util.*;
public class Solution {


	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
int n=s.nextInt();
int fac=0,n1=1,n2=1;
for(int i=3;i<=n;i++){
	fac=n1+n2;
    n1=n2;
    n2=fac;
}
    System.out.println(fac);

		
	}

}
