package sms;
public class Student
{
	private int age;
	private String name;
	private int id;
	private Double marks;
	public Student(int id, int age, String name, Double marks) 
	{
		this.id = id;
		this.age = age;
		this.name = name;
		this.marks = marks;
	}

	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Double getMarks()
	{
		return marks;
	}
	public void setMarks(double marks)
	{
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student id=" + id +", name=" + name +" age=" + age +  ", marks=" + marks;
	}
	
}
