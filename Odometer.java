import java.util.Scanner;
public class Odometer
{	
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		boolean runProgram=true;
		mutator set = new mutator ();
		set.Setfueleff(); 
		while (runProgram=true)
		{
			set.NumMiles();
			set.SetGas();
			set.WriteOutput();
			set.ResetOdometer();
			System.out.println("-------------------------------------------");

			System.out.println("Would you like to go on another trip? (Yes/No) ");
			String again = input.next();
			if (again.toLowerCase().equals("no"))
			{
				System.exit(0);
			}
			else if (again.toLowerCase().equals("yes"))
			{
				runProgram=true;
			}
			else
				System.out.println("This is an invalid input!");
		}
	}
}