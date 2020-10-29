import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int b=s.nextInt();
        int mul=1;
        int i=1;
        for(i=1;i<=b;i++)
        {
        	mul*=n;
        }
		System.out.println(mul);
    }
}
