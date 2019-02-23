import java.util.Scanner;
public class TempConversions
{
	Scanner input = new Scanner(System.in);
	private String type;
	private float f;
	private float c;
	private float temp;
	boolean cat=true;
	public String SetType()
	{
		System.out.println("Would you like to convert from \n°F to °C\n   or \n°C to °F? \n\n(1 OR 2): " );
		type=input.next();
		while (cat=true)
		{
			if (type.equals("1"))
			{
				CalcC();
				break;
			}
			else if (type.equals("2"))
			{
				CalcF();

				break;
			}
			else
			{
				System.out.println("This is an invalid input!");
				break;
			}
		}
		return type; 
	}
	public float CalcC()
	{
		System.out.println("Please input the degrees in Fahrenheit: ");
		f=input.nextFloat();
		temp=(f * 9/5) + 32;
		return temp;
	}
	public float CalcF()
	{
		System.out.println("Please input the degrees in Celcius:");
		c=input.nextFloat();
		temp = ((c - 32)*5)/9;
		return temp;
	} 
	public String ToString()
	{
		if (type.equals("2"))
			return (c+"°C is "+temp+"°F");
		else if (type.equals("1"))
			return (f+"°F is "+temp+"°C");
	return type;			
	}
	public void Compare()
	{
		int f;
		int c;
		while (cat=true)
		{
			System.out.println("Enter a Fahrenheit degrees: ");
			f=input.nextInt();
			System.out.println("Enter a Celcius degrees: ");
			c=input.nextInt();
			f = ((c - 32)*5)/9;
			c = ((f * 9/5) + 32);
			if (c==f)
			{
				System.out.println("This is equal");
				System.exit(0);

			}
			else if (c<f)
			{
				System.out.println("C is less than F");
				System.exit(0);
			}
			else
			{
				System.out.println("F is less than C");
				System.exit(0);
			}


		}

	}




}