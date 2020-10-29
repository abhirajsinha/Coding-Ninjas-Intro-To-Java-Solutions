import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
			Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1; i<=n; i++)
        {
           int fact=0;
            for(int j=1; j<=n; j++)
            {
                if(i%j==0)
                    fact++;
            }
            if(fact==2)
            	System.out.println(i);
               
        }
		
	}
}
