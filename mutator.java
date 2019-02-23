import java.util.Scanner;
public class mutator
{
	Scanner input= new Scanner(System.in);
	private double miles;
	private double fueleff = 0;
	private double odometer;
	private double gas;



	public void WriteOutput()
	{
		System.out.println("Miles Driven: " + miles);
		System.out.println("Gas Consumption: " + gas);
		System.out.println("Fuel Effiency: " + fueleff);
		System.out.println("Odometer: " + odometer);
	}


	public double Setfueleff()
	{//miles per gallon

		System.out.println("What would you like the Fuel Efficiency to be? ");
		fueleff = input.nextInt();

		
		while (fueleff < 10 || fueleff > 200) 
		{
			System.out.println("Invalid Amount. Try again");
			System.out.println("What would you like the new Fuel Efficiency to be? ");
			fueleff = input.nextInt();
		}
		return fueleff; 
	}

	public double ResetOdometer()
	{
		String choice;
		System.out.println("Would you like to reset the odometer to zero? (Yes/No) ");
		choice=input.next();
		if (choice.toLowerCase().equals("yes"))
		{
			odometer=0;
			System.out.print("Odometer: " + odometer);
			System.out.println(" ");
			return odometer;
		}
		else
		{
			System.out.print("Odometer: " + odometer);
			System.out.println(" ");
			return odometer;
		}

	}
	public double NumMiles()
	{//how many miles was driven
		System.out.println("How many miles was your trip? ");
		miles = input.nextInt(); 
		odometer += miles; 
		return miles;

	}
	public double SetGas()
	{//amount of gas used during that trip
		gas = miles/fueleff; 
		return gas;

	}
}



