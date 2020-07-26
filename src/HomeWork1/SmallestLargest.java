package HomeWork1;

import java.util.Scanner;

// Sorting exercise, Name : Gili Faibish, ID : 315141481
public class SmallestLargest {
	public static void main(String[] args) throws Exception{
				
		// Opening scanner
        Scanner scan = new Scanner(System.in);
        
        // Receiving number from user
        System.out.print("Enter your number: ");

        // Reads the number 
        long numN = scan.nextLong();

        // Closing Scanner 
        scan.close();
        
        // Creating an array from the number
		String temp = String.valueOf(numN);
		int[] ArrayOfNum = new int[temp.length()];
		for (int k = 0; k < temp.length(); k++)
			{
			ArrayOfNum[k] = temp.charAt(k) - '0';
			}

		// Sorting the created array from smallest to largest digit
		int n = ArrayOfNum.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (ArrayOfNum[j] > ArrayOfNum[j+1]) 
                { 
                    int temp2 = ArrayOfNum[j]; 
                    ArrayOfNum[j] = ArrayOfNum[j+1]; 
                    ArrayOfNum[j+1] = temp2; 
                } 
        
        // Printing the largest and smallest to the user
        System.out.println("Smallest and largest digits: " + ArrayOfNum[0] + " , " + ArrayOfNum[ArrayOfNum.length - 1]); 
	}
}
