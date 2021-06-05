package sms;
import java.util.*;
public class Implem implements StudFunc
{
	LinkedHashMap<Integer,Student> db =new LinkedHashMap<>();
	Scanner s=new Scanner(System.in);
	public void addStudent()
	{
		System.out.println("Enter id,age,Name and marks");
		int id=s.nextInt();
		int age=s.nextInt();
		String name=s.next();
		Double marks=s.nextDouble();
		
		Student obj=new Student(id,age,name,marks);
		db.put(id, obj);
		System.out.println("Inserted succesfully");
	}

	public void removeStudent()
	{
		System.out.println("Enter student id");
		int id=s.nextInt();
		if(db.containsKey(id))
		{
			db.remove(id);
			System.out.println("Student record deleted");
		}
		else
			System.out.println("Enter valid id");
			
	}

	public void removeAllStudents()
	{
		db.clear();
		System.out.println("All student record deleted");
	}

	public void displayStudent()
	{
		System.out.println("Enter student id");
		int id=s.nextInt();
		if(db.containsKey(id))
		{
			Student obj=db.get(id);
			System.out.println("ID:"+obj.getId());
			System.out.println("Age"+obj.getAge());
			System.out.println("Name"+obj.getName());
			System.out.println("Marks"+obj.getMarks());
		}
		else
			System.out.println("Enter valid id");
	}

	public void displayAllStudents() 
	{
		Set<Integer> setofkeys=db.keySet();
		for(int key:setofkeys)
			System.out.println(db.get(key));
	}

	public void updateStudents()
	{
		System.out.println("Enter student id");
		int id=s.nextInt();
		
		if(db.containsKey(id))
		{
			System.out.println("Student record available");
			Student obj=db.get(id);
			System.out.println("1.Update name\n2.Updare age\n3.Update marks");
			System.out.println("Enter choice");
			int choice=s.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter name");
				String name=s.next();
				obj.setName(name);
				System.out.println("Name updated");
				break;
			case 2:
				System.out.println("Enter age");
				int age =s.nextInt();
				obj.setAge(age);
				System.out.println("Age updated");
				break;
			case 3:
				System.out.println("Enter marks");
				Double marks=s.nextDouble();
				obj.setMarks(marks);
				System.out.println("Marks updated");
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
		else
			System.out.println("Student record not present");
	}

	public void countStudents() 
	{
		System.out.println("Student records available: "+db.size());
	}

	public void sortStudents()
	{
		ArrayList<Student> l=new ArrayList<>();
		Set<Integer> setofkeys=db.keySet();
		for(int id:setofkeys)
			l.add(db.get(id));
		System.out.println("1.Sort based on id\n2.Sort based on age\n3.Sort based on name\n4.Sort based on marks");
		System.out.println("Enter choice");
		int choice=s.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("Sorting based on id");
				Collections.sort(l,new SortStudentsById());
				for(Student std:l)
					System.out.println(std);
				break;
			case 2:
				System.out.println("Sorting based on age");
				Collections.sort(l,new SortStudentByAge());
				for(Student std:l)
					System.out.println(std);
				break;
			case 3:
				System.out.println("Sorting based on name");
				Collections.sort(l,new SortStudentByName());
				for(Student std:l)
					System.out.println(std);
				break;
			case 4:
				System.out.println("Sorting based on marks");
				Collections.sort(l,new SortByMarks());
				for(Student std:l)
					System.out.println(std);
				break;
			default:
				System.out.println("Invalid choice");
		}
		
	}
}
