package HomeWork1;

// Prime numbers exercise, Name : Gili Faibish, ID : 315141481
public class PrimeNumbers {
	   public static void main (String[] args)
	   {	
		   
		   // Variable definitions
	       int i =0;
	       int num =0;
	       String  primeNumbers = "";
	       
	       // Action 
	       for (i = 2; i <= 200; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }
	       
	       // Print to user
	       System.out.println("Prime numbers from 2 to 200 are :");
	       System.out.println(primeNumbers);
	   }
}
