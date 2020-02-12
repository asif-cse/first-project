package oop;
import java.util.*;
public class Pyramid {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = input.nextInt();
		
        for (int row = 1; row <=n; row++) {
			for (int spase = 1; spase <= n-row; spase++) {
				System.out.print(" ");				
			}
			for (int p = 1; p <=2*row-1; p++) {
				System.out.print("*");			
			}
			System.out.println(" ");
			
		}
		
	}
}
