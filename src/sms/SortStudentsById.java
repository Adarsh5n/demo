package sms;
import java.util.*;
public class SortStudentsById implements Comparator<Student>
{
	public int compare(Student x,Student y)
	{
		return x.getId()-y.getId();
	}
}
