import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);// Write your code here
        int n=s.nextInt();
        int  term=0;
        for(int i=1;i<=n;i++){
            term=3*i+2;
            if(!(term%4==0))
                
                System.out.print(term+" ");
            else
                n++;
              continue;  
        }
	}
}
