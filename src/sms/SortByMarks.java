package sms;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student>
{
	public int compare(Student x,Student y)
	{
		return x.getMarks().compareTo(y.getMarks());
	}
}
