import java.util.Scanner;
public class IT24101520Lab5Q1 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		
		//initialization of variables
		int large=0;
		int small=0;
		
		//getting user inputs and assigning them to variables.
		System.out.print("Enter the first integer: ");
		int firstInt= input.nextInt();
	
		System.out.print("Enter the second integer: ");
		int secondInt= input.nextInt();
	
		System.out.print("Enter the third integer: ");
		int thirdInt= input.nextInt();
	
		System.out.println();
	
		//printing all three user input numbers.
		System.out.println("User entered numbers are: "+firstInt+" "+secondInt+" "+thirdInt);
	
		//finding the largest number
		if (firstInt>secondInt && firstInt>thirdInt)
		{
			large=firstInt;
		}
		else if (secondInt>thirdInt)
		{
			large=secondInt;
		}
		else 
		{
			large=thirdInt;
		}
		
		//finding the smallest number.
		if (firstInt<secondInt && firstInt<thirdInt)
		{
			small=firstInt;
		}
		else if (secondInt<thirdInt)
		{
			small=secondInt;
		}
		else
		{
			small=thirdInt;
		}
		
		//printing the output of the smallest no. and the largest no.
		System.out.println("The smallest number is: "+small);
		System.out.print("The Largest number is: " +large );
	}
}