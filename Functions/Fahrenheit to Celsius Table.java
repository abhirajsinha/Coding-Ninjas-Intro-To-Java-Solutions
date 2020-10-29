import java.util.Scanner;
public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		  while(start<=end) {
			int cel = (5*(start-32))/9;

			System.out.print(start);
            System.out.print(" \t ");
            System.out.println(cel);
	
			start = start + step;
		} 
    }
  }
