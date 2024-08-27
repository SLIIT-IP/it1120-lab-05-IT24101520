import java.util.Scanner;
public class IT24101520Lab5Q3 {
	
	//initiating constants
	public static final int chargePerDay = 48000;
	public static final int discount3to4 = 10;
	public static final int discount5orMore = 20;
	
	public static void main(String[] args) {
		
		//creating a new scanner object
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter start date (1-31): ");
		int startDate = input.nextInt();
		
		System.out.print("Enter end date (1-31): ");
		int endDate = input.nextInt();
		
		System.out.println("");
		
		//validating if the entered dates are between 1-31
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate >31)
		{
			System.out.print("Error: Days must be between 1 and 31");
			return;
		}
		
		//validating if the start date is less than the end date
		if (startDate >= endDate)
		{
			System.out.print("Error: Start date must be less than End Date");
			return;
		}
		
		//no. of dates reserved 
		int reserved = endDate - startDate;
		int discountRate = 0;
		
		if (reserved >= 3 && reserved < 5)
		{
			discountRate = discount3to4;
		}
		else if (reserved >= 5)
		{
			discountRate = discount5orMore;
		}
		
		double total = chargePerDay * reserved;
		double discount = total * discountRate / 100.0;
		total -= discount;
		
		System.out.println("Room Charge per Day: " + chargePerDay + "/=");
		System.out.println("Number of Days Reserved: " + reserved);
		System.out.println("Total Amount to be Paid:" + total);
	}
}