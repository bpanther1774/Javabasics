package loops;

import java.util.Scanner;

public class StarPatterns {

	public static void IncreaseStars(int n) {
		int i, j;

		// outer loop to handle number of rows (n in this case )

		for (i = 0; i <= n; i++) {
			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}
			// ending line after each row
			System.out.println();
		}
	}
	public static void DecreaseStars(int n) {
		int i, j;

		// outer loop to handle number of rows (n in this case )

		for (i = 0; i <= n; i++) {
			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (j = 5; j >i; j--) {
				// printing stars
				System.out.print("* ");
			}
			// ending line after each row
			System.out.println();
		}
	}

	public static void Traingle(int n) {
		

		int rows =n;

		 // loop to iterate for the given number of rows (n in this case )
        for (int i = 1; i <= rows; i++) { 
  
            // loop to print the number of spaces before the star 
            for (int j = rows; j >= i; j--) { 
                System.out.print(" "); 
            } 
  
            // loop to print the number of stars in each row 
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            } 
  
            // for new line after printing each row 
            System.out.println(); 
        } 
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//IncreaseStars(n);
		//DecreaseStars(n);
		Traingle(n);
	}
}
