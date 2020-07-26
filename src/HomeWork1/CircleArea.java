package HomeWork1;

import java.util.Scanner;

// Circle area exercise, Name : Gili Faibish, ID : 315141481
public class CircleArea {
    public static void main(String[] args) 
    {
    	// Opening scanner
        Scanner scan = new Scanner(System.in);
        
        // Receiving number from user
        System.out.print("Enter your radius: ");

        // Reads the number 
        long Radius = scan.nextLong();

        // Closing Scanner 
        scan.close();
        
        // Definitions for pi and area
        double pi = 3.14, area;
        
        // Calculate circle area and prints the results to user
        area = pi * Radius * Radius;
        System.out.println("Area of your circle:"+area);
    }            
}
