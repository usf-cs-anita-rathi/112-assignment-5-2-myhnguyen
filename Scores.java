import java.util.Scanner;
public class Scores
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean runProgram = true;
		System.out.println("Welcome to CS112! We will calculate your grade for you!");
		System.out.println("---------------------------------------------------------");
		StudentRecords set = new StudentRecords();
		while (runProgram = true)
		{
			set.SetScores();
			set.WriteOutput();
			set.ConvertScores();
			System.out.println(set.ToString());

			System.out.println("Would you like to calculate another score? (Yes/No) ");
			String again = input.next();
			if (again.toLowerCase().equals("no"))
			{
				System.exit(0);
			}
			else if (again.toLowerCase().equals("yes"))
			{
				runProgram = true;
			}
			else
				System.out.println("This is an invalid input!");
		}
	}
}