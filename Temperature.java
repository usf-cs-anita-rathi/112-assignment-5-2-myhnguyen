import java.util.Scanner;
public class Temperature
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean runProgram = true;
		System.out.println("---------------------------------------------------------");
		TempConversions set = new TempConversions();
		while (runProgram = true)
		{
			set.SetType();
			System.out.println(set.ToString());
			System.out.println("---------------------------------------------------------");
			System.out.println("Would you like to convert another temperature? (Yes/No) ");
			String again = input.next();
			if (again.toLowerCase().equals("no"))
			{
				System.out.println("We will now compare numbers!");
				set.Compare();
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















// import java.util.*;
 
// class Temperature {
//   public static void main(String[] args) {
//     float temp;
//     Scanner in = new Scanner(System.in);
 
//     System.out.println("Enter temperature in Fahrenheit");
//     temp = in.nextInt();
 
//     temp = ((temp - 32)*5)/9;
 
//     System.out.println("Temperature in Celsius = " + temp);
//   }
// }