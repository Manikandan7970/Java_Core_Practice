package Methods_03;

public class Task01_StudentGreetingSystem {
	
	public void displayWelcome()
	{
		System.out.println("Welcome To Our Academy...");
	}
	public void displayStudentName(String name)
	{
		System.out.println("Student Name : "+name);
	}
	public void displayCourse(String course)
	{
		System.out.println("Course : "+course);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 1 – Student Greeting System
//		Objective
//
//		Create methods to display student information.
//
//		Methods
//		displayWelcome()
//		displayStudentName(String name)
//		displayCourse(String course)
//		Concepts
//		Void methods
//		Method calling
//		Parameters
		
		Task01_StudentGreetingSystem o=new Task01_StudentGreetingSystem();
		o.displayWelcome();
		o.displayStudentName("Manikandan");
		o.displayCourse("Java FullStack Development.");

	}

}
