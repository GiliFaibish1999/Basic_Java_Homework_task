package HomeWork1;

import java.util.Scanner;

// Fibonnaci exercise, Name : Gili Faibish, ID : 315141481
public class fibonacci {
    public static void main(String[] args) {
    	
    	// Opening scanner
        Scanner scan = new Scanner(System.in);
        
        // Receiving number from user
        System.out.print("Enter a number: ");

        // Reads the number 
        Long numN = scan.nextLong();

        // Closing Scanner 
        scan.close();

        // Create and print fibonacci
        int  t1 = 1, t2 = 1;
        System.out.print("First " + numN + " numbers: ");

        for (int i = 1; i <= numN; ++i)
        {
            System.out.print(t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            if (i< numN) {
            	 System.out.print(" , ");
            }
            else {
            	;
            }
        }
    }
}
