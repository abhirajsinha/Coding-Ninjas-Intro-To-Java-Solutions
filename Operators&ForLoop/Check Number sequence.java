import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int pre=scan.nextInt();
        
        int count =2;
        boolean ans = true;
        while(count<=n){
           int curr = scan.nextInt();
            count++;
            if(pre==curr){
                System.out.println("false");
                return;
            }
            
            if(pre>curr){
                if(ans==false){
                System.out.println("false");
                return;
                }
            }
             else{
               if(ans==true){
                   ans = false;
               }
             }
               
               pre = curr;
        }
               
     System.out.println("true");

	}
}
