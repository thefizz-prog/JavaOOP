package weekThree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopsExercises {

	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		

	//whileLoop3();
		LoopsExercises hist = new LoopsExercises();
		hist.histogram();
	}
	
	private static void whileLoop() {
		int i =1;
		int sum = 0;
		while ( i<=5) {
			
			sum +=i;
			System.out.println(sum);
			i++;
		}
		System.out.println(sum);
	}
	
	private static void whileLoop2() {
		int i =5;
		int sum = 0;
		while ( i>0) {
			
			sum +=i;
			System.out.println("Sum: " + sum + "i: " + i);
			i--;
		}
		//System.out.println(sum);
	}
	
	private static void whileLoop3() {
		int num1 =0;
		int sum =0;
		System.out.println("Enter a number (-1 to exit)");
		
		
		do {
			try {
			if (sc.nextInt() == -1) break;
			}
			catch (InputMismatchException e ) {
				e.printStackTrace();
			}
			num1 = sc.nextInt();
			sum+=num1;
		}
		while (  sc.nextInt() != -1 );
		System.out.println("Sum is:" + sum);
		 //System.out.println(sum);
	}
	
	private void histogram() {
		System.out.println("Enter two inputs");
		int i = sc.nextInt();
		int y = sc.nextInt();
		
		int ii=0;
		int yy=0;
		
		while (yy<y) {
			while(ii<i) {
				System.out.print("*");
				ii++;
			}
			System.out.println();
			ii = 0;//System.out.println();
			yy++;
		}
	}
}
