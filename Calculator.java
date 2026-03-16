import java.util.*;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter 1st Number");
		int a=sc.nextInt();

		System.out.println("Enter 2nd Number");
		int b=sc.nextInt();

		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");

		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("Add both a and b:" +(a+b));
			break;
			case 2 :
				System.out.println("Subtract both a and b:" +(a-b));
			break;
			case 3 :
				System.out.println("Multiply both a and b:" +(a*b));
			break;
			case 4 :
				System.out.println("Divide both a and b:" +(a%b));
			break;

			default:
				System.out.println("Invalid Numbers");	

		}
		sc.close();

	}
}
