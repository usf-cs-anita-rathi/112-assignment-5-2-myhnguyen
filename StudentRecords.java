import java.util.Scanner;
public class StudentRecords
{
	Scanner input = new Scanner(System.in);
	private double q1;
	private double q2;
	private double q3;
	private double midterm;
	private double finalexam;
	private int score = 0;
	public String grade;

	public void WriteOutput()
	{
		System.out.println("Final numerical score: " + score);
	}

	public double SetScores()
	{
		System.out.println("Score of quiz 1: ");
		q1=input.nextDouble();
		System.out.println("Score of quiz 2: ");
		q2=input.nextDouble();
		System.out.println("Score of quiz 3: ");
		q3=input.nextDouble();
		System.out.println("Score of midterm: ");
		midterm=input.nextDouble();
		System.out.println("Score of final: ");
		finalexam=input.nextDouble();

		double finalquizscore = (((q1 + q2 + q3) / 30) * 25);
		double finalmidtermscore = ((midterm / 100) * 35);
		double finalexamscore = ((finalexam /100) * 40);
		score=(int)(finalquizscore + finalexamscore + finalmidtermscore);

		return score;
	}
	public void ConvertScores()
	{	
		if(score>=90)
			grade = "A";
		else if(score>=80)
			grade = ("B");
		else if(score>=70)
			grade = ("C");
		else if(score>=60)
			grade = ("D");
		else
			grade = ("F");
		System.out.println("Final letter grade: " + grade);
		
	}
	public String ToString()
	{
	return("STUDENT RECORD:\n"+"Quiz 1: "+q1+"\nQuiz 2: "+q2+"\nQuiz 3: "+q3+"\nMidterm: "+midterm+"\nFinal Exam: "+finalexam+"\nTotal Numerical Grade: "+score+"\nLetter Grade: "+grade) ;
	}
}
