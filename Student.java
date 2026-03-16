class Student 
{
	int rollnumber;
	String name;
	int age;
	String course;

	public static void main(String[] args) 
	{
		Student student=new Student();
		student.rollnumber=12;
		student.name="Akash";
		student.age=25;
		student.course="CSE";
		System.out.println(student.rollnumber);
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student.course);


	}
}
