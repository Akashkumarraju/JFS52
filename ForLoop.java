import java.util.*;
class ForLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			if(a==10)
			{
				System.out.println("Numbers are in Series");
			}
			else{
				System.out.println("Numbers are not in Series");
			}
		}
	}
}
