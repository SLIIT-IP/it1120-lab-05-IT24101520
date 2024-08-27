import java.util.Scanner;
public class IT24101520Lab5Q2 {
	public static void main(String[] args) {
	
	//creating a new scanner object
	Scanner input = new Scanner (System.in);
	
	//getting user inputs
	System.out.print("Enter the number of new members introduced: ");
	int newMember = input.nextInt();
	
	System.out.println("");
	
	//logic to find the type of price for the number of customers introduced
	if (newMember<0)
	{
		System.out.print("Input must be 0 or greater.");
	}
	else 
	{
	String price;
		switch(newMember)
		{
			case 0:
			price = "No price";
			break;
			
			case 1:
			price = "Pen";
			break;
			
			case 2:
			price = "Umbrella";
			break;
			
			case 3:
			price = "Bag";
			break;
			
			case 4:
			price = "Travelling Bag";
			break;
			
			default:
			price = "Headphone";
			break;
		}
		
	System.out.print("Prize is: "+ price);
	}
	
	}
}