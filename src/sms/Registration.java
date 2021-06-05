package sms;
import java.util.*;
public class Registration {
	public static void main(String[] args)
	{
		System.out.println("Welcome");
		Scanner scan = new Scanner(System.in);
		System.out.println("------------");
		StudFunc obj=new Implem();
		
		while(true)
		{
			System.out.println("1.Add student\n2.Remove student\n3.Remove all students\n4.Display students");
			System.out.println("5.Display all students\n6.Update student\n7.Count student\n8.Sort students\n9.Exit\nEnter choice");
			int choice=scan.nextInt();
			switch(choice)
			{
				case 1: obj.addStudent();
				break;
				case 2: obj.removeStudent();
				break;
				case 3: obj.removeAllStudents();
				break;
				case 4: obj.displayStudent();
				break;
				case 5: obj.displayAllStudents();
				break;
				case 6: obj.updateStudents();
				break;
				case 7: obj.countStudents();
				break;
				case 8: obj.sortStudents();
				break;
				case 9: System.exit(0);
				break;
				default: System.out.println("Invalid choice");
			}
			System.out.println("==========================");
		}
	}
}
