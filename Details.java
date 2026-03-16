import java.util.*;
class Details{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The name");
String studentname=sc.nextLine();
System.out.println("Enter the age");
int age=sc.nextInt();
sc.nextLine();
System.out.println("Enter the grade");
String grade=sc.nextLine();
System.out.println("Enter the Marks");
double marks=sc.nextDouble();
System.out.println("Enter the ispassed");
boolean ispassed=sc.nextBoolean();

System.out.println("Enter the Name" + studentname);
System.out.println("Enter the Age" +age);
System.out.println("Enter the Grade" + grade);
System.out.println("Enter the Marks" +  marks);
System.out.println("Enter the ispassed" +ispassed);

}
}